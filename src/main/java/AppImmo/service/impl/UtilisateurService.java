package AppImmo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import AppImmo.entities.Utilisateur;
import AppImmo.repositories.IUtilisateurRepository;
import AppImmo.service.IUtilisateurService;

@Service("uservice")
public class UtilisateurService implements IUtilisateurService, UserDetailsService {

	@Autowired
	@Qualifier("urepo")
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

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur user = repo.findByLogin(username);
		if (user == null) {
			throw new UsernameNotFoundException("Pas d'utilisateur correspondant à : "+ username);
		} else {
			return user;			
		}
	}



}