package io.mateu.erp.model.organization;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * holder for points of sale (e.g. a website, webservices)
 *
 * Created by miguel on 13/9/16.
 */
@Entity
@Table(name = "MA_POINTOFSALE")
@Getter
@Setter
public class PointOfSale {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="pointofsale_seq_gen")
    @SequenceGenerator(name="pointofsale_seq_gen", sequenceName="POSIDPOS_SEQ", allocationSize = 1)
    @Column(name = "POSIDPOS")
    private long id;

    @Column(name = "POSNAME")
    private String name;

}
