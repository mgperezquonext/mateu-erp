package io.mateu.erp.model.organization;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * holder for offices (e.g. Central, Ibiza, Tokio)
 *
 * Created by miguel on 13/9/16.
 */
@Entity
@Table(name = "MA_OFFICE")
@Getter@Setter
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="office_seq_gen")
    @SequenceGenerator(name="office_seq_gen", sequenceName="OFFIDOFF_SEQ", allocationSize = 1)
    @Column(name = "OFFIDOFF")
    private long id;

    @Column(name = "OFFNAME")
    private String name;



}
