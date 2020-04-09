package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppImmo.entities.Contrat;
import AppImmo.repositories.IContratRepository;
import AppImmo.service.IContratService;

@Service
public class ContratService implements IContratService {

	@Autowired
	private IContratRepository repo;

	@Override
	public Contrat saveOrUpdate(Contrat c) {
		return repo.save(c);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public Contrat getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Contrat> findAll() {
		return repo.findAll();
	}



}