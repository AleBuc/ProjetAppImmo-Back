package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.Visite;

@Repository("vrepo")
public interface IVisiteRepository extends JpaRepository<Visite, Long>{

}
