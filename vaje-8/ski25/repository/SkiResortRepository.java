package si.unm.fis.prspr.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.ski.entity.SkiResort;
import java.util.List;
import si.unm.fis.prspr.ski.entity.Country;


public interface SkiResortRepository extends JpaRepository<SkiResort, Integer> {
    List<SkiResort> findAllByCountry(Country country);
    List<SkiResort> findAllByNoOfSlopesGreaterThanEqual(Integer givenNumber);

}
