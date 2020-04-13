package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import AppImmo.entities.Contrat;

@Repository("contrepo")
public interface IContratRepository extends JpaRepository<Contrat, Long> {

}
