package si.unm.fis.prspr.dogs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Dog {
    @Id
    private Integer id;
	private String name;
	private String breed;
	private Integer length;
	private Integer weight;

    @ManyToOne
    private Owner owner;
}
