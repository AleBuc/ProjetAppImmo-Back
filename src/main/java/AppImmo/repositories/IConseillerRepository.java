package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.Conseiller;

@Repository("consrepo")
public interface IConseillerRepository extends JpaRepository<Conseiller, Long>{

}
