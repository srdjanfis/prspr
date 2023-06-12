package local.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import local.ski.entity.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {

}
