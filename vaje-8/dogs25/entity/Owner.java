package si.unm.fis.prspr.dogs.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Owner {
    @Id
    private Integer id;
	private String firstName;
	private String lastName;
	private String city;

    @OneToMany(mappedBy="owner")
    @JsonIgnore
    private List<Dog> dogs;
}
