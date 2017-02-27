package io.mateu.erp.model.product.transfer;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by miguel on 25/2/17.
 */
@Entity
@Getter
@Setter
public class TransferPoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private TransferPointType type;

    private String name;

    private String instructions;



}