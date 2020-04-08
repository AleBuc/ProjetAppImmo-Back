package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.BienImmo;

@Repository("birepo")
public interface IBienImmoRepository extends JpaRepository<BienImmo, Long>{

}
