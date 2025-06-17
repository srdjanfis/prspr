package si.unm.fis.prspr.ski.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkiSlope {
    @Id
    private Integer id;
    private String name;
    private String difficulty;

    @ManyToOne
    private SkiResort skiResort;
}
