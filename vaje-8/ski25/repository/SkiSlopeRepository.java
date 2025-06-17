package si.unm.fis.prspr.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.ski.entity.SkiSlope;
import java.util.List;
import si.unm.fis.prspr.ski.entity.SkiResort;


public interface SkiSlopeRepository extends JpaRepository<SkiSlope, Integer>{
    List<SkiSlope> findAllBySkiResort(SkiResort skiResort);
    List<SkiSlope> findAllByDifficulty(String difficulty);
}
