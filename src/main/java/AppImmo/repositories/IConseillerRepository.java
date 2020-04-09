package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import AppImmo.entities.Conseiller;

public interface IConseillerRepository extends JpaRepository<Conseiller, Long>{

}
