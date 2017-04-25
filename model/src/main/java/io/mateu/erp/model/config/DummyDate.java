package io.mateu.erp.model.config;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by miguel on 18/4/17.
 */
@Entity
@Getter
@Setter
public class DummyDate {

    @Id
    private LocalDate value;

    public DummyDate() {

    }

    public DummyDate(LocalDate date) {
        value = date;
    }
}
