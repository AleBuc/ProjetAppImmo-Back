package AppImmo.service;

import java.util.List;

import AppImmo.entities.ClasseStandard;
import AppImmo.entities.Client;

public interface IClasseStandardService {

	public ClasseStandard saveOrUpdate(ClasseStandard cs);

	public void delete(long id);

	public ClasseStandard getById(long id);

	public List<ClasseStandard> findAll();

	public List<Client> classeStandardInt(long id);

}
