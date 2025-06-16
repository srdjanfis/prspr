package si.unm.fis.prspr.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.ski.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
