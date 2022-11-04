package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

public interface PLanguageTechnologyService {
	void add(ProgrammingLanguageTechnology programmingLanguageTechnology);
	void update(ProgrammingLanguageTechnology programmingLanguageTechnology);
	void delete(int id);
	ProgrammingLanguageTechnology getById(int id);
	List<ProgrammingLanguageTechnology> getAll();
}
