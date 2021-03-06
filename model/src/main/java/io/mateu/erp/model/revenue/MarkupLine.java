package io.mateu.erp.model.revenue;

import io.mateu.ui.mdd.server.annotations.SearchFilter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class MarkupLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @NotNull
    @SearchFilter
    private Markup markup;

    @ManyToOne
    @NotNull
    @SearchFilter
    private Product product;

    private boolean active;

    private double minimumRevenuePerBooking;

    private double maximumRevenuePerBooking;

    private double percent;

}
