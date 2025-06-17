package si.unm.fis.prspr.ski.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SkiResort {
    @Id
    private Integer id;
    private String name;
    private Integer noOfSlopes;

    @ManyToOne
    private Country country;

    @OneToMany(mappedBy="skiResort")
    @JsonIgnore
    private List<SkiSlope> skiSlopes;
}
