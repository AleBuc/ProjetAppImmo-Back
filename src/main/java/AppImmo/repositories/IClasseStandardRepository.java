package AppImmo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AppImmo.entities.ClasseStandard;

@Repository("csrepo")
public interface IClasseStandardRepository extends JpaRepository<ClasseStandard, Long>{

}
