package com.quonext.quoon;

import com.google.common.base.Strings;
import io.mateu.erp.log.Logger;
import io.mateu.erp.model.financials.Actor;
import io.mateu.erp.model.organization.Office;
import io.mateu.erp.model.util.Helper;
import io.mateu.ui.mdd.server.annotations.Output;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Getter
@Setter
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    private boolean active;

    @OneToOne(mappedBy = "agent")
    @NotNull
    private Actor provider;

    @ManyToOne
    @NotNull
    private Office office;

    @NotNull
    private String MQHost;

    @NotNull
    private String uploadQueue;

    @NotNull
    private String downloadQueue;

    @NotNull
    private String MQUser;

    @NotNull
    private String MQPassword;

    private String errorNotificationEmails;

    @Temporal(TemporalType.TIMESTAMP)
    @Output
    private Date lastSentMessage;

    @Temporal(TemporalType.TIMESTAMP)
    @Output
    private Date lastReceivedMessage;

    @Output
    private QueueStatus downloadQueueStatus = QueueStatus.UNUSED;

    @Output
    private QueueStatus uploadQueueStatus = QueueStatus.UNUSED;

    @Output
    private String downloadQueueError;

    @Output
    private String uploadQueueError;


    public void notifyError(ErrorType type, String msg) {

        try {
            // registramos la incidencia

            Logger.log("com.quonext.quoon.agent", "" + getId(), getName(), null,"" + type, msg);

            // enviamos el error si así está configurado

            if (ErrorType.URGENT.equals(type) && !Strings.isNullOrEmpty(getErrorNotificationEmails())) {
                for (String email : getErrorNotificationEmails().trim().split("[,;:\n \t]+")) {
                    try {
                        Helper.sendEmail(getErrorNotificationEmails(), "Quoon synchronization error", msg, true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

    }


}
