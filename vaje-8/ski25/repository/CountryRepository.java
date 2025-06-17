package si.unm.fis.prspr.ski.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.ski.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    List<Country> findAllByNameStartsWith(String givenString);
}
