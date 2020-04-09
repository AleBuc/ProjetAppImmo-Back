package AppImmo.service;

import java.util.List;

import AppImmo.entities.ClasseStandard;

public interface IClasseStandardService {

	public ClasseStandard saveOrUpdate(ClasseStandard ca);

	public void delete(long id);

	public ClasseStandard getById(long id);

	public List<ClasseStandard> findAll();
}
