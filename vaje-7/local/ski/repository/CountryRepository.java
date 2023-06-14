package local.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import local.ski.entity.Country;
import java.util.List;


public interface CountryRepository extends JpaRepository<Country, Integer> {
	List<Country> findByNameCountryStartsWith(String startsWith);
	List<Country> findByNameCountryStartsWithAndDescCountryContainsOrderByNameCountry(String startsWith, String contains);
}