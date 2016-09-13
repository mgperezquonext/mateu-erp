package mateu.erp.model.map;

import lombok.Getter;
import lombok.Setter;
import mateu.erp.model.multilanguage.Translation;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * holder for states
 *
 * Created by miguel on 13/9/16.
 */
@Entity
@Getter@Setter
@Table(name = "MA_STATE")
public class State {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="state_seq_gen")
    @SequenceGenerator(name="state_seq_gen", sequenceName="STTIDSTT_SEQ")
    @Column(name = "STTIDSTT")
    private long id;

    @ManyToOne
    @Column(name = "STTNAMEIDTRA")
    private Translation name;

    @ManyToOne
    @Column(name = "STTCOUISOCODE")
    private Country country;

    @OneToMany(mappedBy = "state")
    private List<City> cities = new ArrayList<>();

}
