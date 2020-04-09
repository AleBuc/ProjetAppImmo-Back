package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import AppImmo.entities.Contrat;

@Repository
public interface IContratRepository extends JpaRepository<Contrat, Long> {

}
