package local.Dogs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import local.Dogs.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{

}
