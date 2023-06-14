package local.ski.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import local.ski.entity.Slope;

public interface SlopeRepository extends JpaRepository<Slope, Integer> {
	List<Slope> findBySlopeLengthBetween(Integer odLength, Integer doLength);
}
