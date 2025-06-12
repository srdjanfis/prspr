package si.unm.fis.prspr.ski.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkiSlope {
    private Integer id;
    private String name;
    private String hardness;
    private Integer idSkiResort;
}
