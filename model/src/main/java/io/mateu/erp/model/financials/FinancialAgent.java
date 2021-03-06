package io.mateu.erp.model.financials;

import io.mateu.erp.model.payments.Deposit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * holder for a admin agent, tipically associated to a VAT ID (e.g. a customer, a supplier, ourselves)
 *
 * Sometimes the same admin agent will act as customer and as supplier. This is interesting to manage a balance of payments
 *
 * Created by miguel on 13/9/16.
 */
@Entity
@Getter@Setter
public class FinancialAgent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "agent")
    private List<Deposit> deposits = new ArrayList<>();

    @Override
    public String toString() {
        return getName();
    }
}
