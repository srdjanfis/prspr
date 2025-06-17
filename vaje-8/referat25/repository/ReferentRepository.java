package si.unm.fis.prspr.referat.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import si.unm.fis.prspr.referat.model.Referent;


public interface ReferentRepository extends JpaRepository<Referent, Integer> {
    List<Referent> findByUsernameAndPassword(String username, String password);
}
