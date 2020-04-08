package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.Personne;

@Repository("personnerepo")
public interface IPersonneRepository extends JpaRepository<Personne, Long> {

}
