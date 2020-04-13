package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import AppImmo.entities.Visite;
import AppImmo.repositories.IVisiteRepository;
import AppImmo.service.IVisiteService;

@Service("vrepo")
public class VisiteService implements IVisiteService {

	@Autowired
	@Qualifier("vrepo")
	private IVisiteRepository repo;

	@Override
	public Visite saveOrUpdate(Visite v) {
		return repo.save(v);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public Visite getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Visite> findAll() {
		return repo.findAll();
	}

}
