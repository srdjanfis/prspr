package si.unm.fis.prspr.ski.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SkiResort {
    private Integer id;
    private String name;
    private Integer noOfSlopes;
    private Integer idCountry;
}
