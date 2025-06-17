package si.unm.fis.prspr.ski.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Country {
    @Id
    private Integer id;
    private String name;
    private String description;

    @OneToMany(mappedBy="country")
    @JsonIgnore
    private List<SkiResort> skiResorts;
}
