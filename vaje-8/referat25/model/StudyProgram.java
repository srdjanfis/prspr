package si.unm.fis.prspr.referat.model;

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
public class StudyProgram {
    @Id
    private Integer id;
    private String name;

    @OneToMany(mappedBy="studyProgram")
    @JsonIgnore
    private List<Student> students;
}
