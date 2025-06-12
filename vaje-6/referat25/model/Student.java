package si.unm.fis.prspr.referat.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private Integer id;
    private String idIskaznice;
    private String ime;
    private String priimek;
    private String studijskiProgram;
}
