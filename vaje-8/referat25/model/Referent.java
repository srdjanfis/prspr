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
public class Referent {
    @Id
    private Integer id;
    private String ime;
    private String priimek;
    private String username;
    private String password;
}
