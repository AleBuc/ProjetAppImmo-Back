package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.ClasseStandard;
import AppImmo.repositories.IClasseStandardRepository;
import AppImmo.service.IClasseStandardService;

@Service("csservice")
public class ClasseStandardService implements IClasseStandardService {

	@Autowired
	@Qualifier("csrepo")
	private IClasseStandardRepository repo;

	@Override
	public ClasseStandard saveOrUpdate(ClasseStandard cs) {
		return repo.save(cs);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public ClasseStandard getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<ClasseStandard> findAll() {
		return repo.findAll();
	}

}
