package si.unm.fis.prspr.referat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    private Integer id;
    
    private String idIskaznice;
    private String ime;
    private String priimek;
    private String studijskiProgram;
}
