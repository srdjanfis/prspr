package si.unm.fis.prspr.ski.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Country {
    private Integer id;
    private String name;
    private String description;
}
