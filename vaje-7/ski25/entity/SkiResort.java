package si.unm.fis.prspr.ski.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private Integer idCountry;
}
