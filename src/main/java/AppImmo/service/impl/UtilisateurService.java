package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AppImmo.entities.Utilisateur;
import AppImmo.repositories.IUtilisateurRepository;
import AppImmo.service.IUtilisateurService;

@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	private IUtilisateurRepository repo;

	@Override
	public Utilisateur saveOrUpdate(Utilisateur c) {
		return repo.save(c);
	}

	@Override
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public Utilisateur getById(long id) {
		return repo.findById(id).get();
	}

	@Override
	public List<Utilisateur> findAll() {
		return repo.findAll();
	}



}