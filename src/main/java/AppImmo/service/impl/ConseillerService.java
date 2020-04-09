package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppImmo.entities.Conseiller;
import AppImmo.repositories.IConseillerRepository;
import AppImmo.service.IConseillerService;

@Service
public class ConseillerService implements IConseillerService {

	@Autowired
	private IConseillerRepository repo;

	@Override
	public Conseiller saveOrUpdate(Conseiller c) {
		return repo.save(c);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public Conseiller getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Conseiller> findAll() {
		return repo.findAll();
	}



}