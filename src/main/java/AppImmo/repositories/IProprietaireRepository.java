package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.Proprietaire;

@Repository
public interface IProprietaireRepository extends JpaRepository<Proprietaire,Long> {

}
