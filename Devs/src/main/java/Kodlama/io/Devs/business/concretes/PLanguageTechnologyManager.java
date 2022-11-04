package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.PLanguageTechnologyService;
import Kodlama.io.Devs.dataAccess.abstracts.PLanguageTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

@Service
public class PLanguageTechnologyManager implements PLanguageTechnologyService{
	
	private PLanguageTechnologyRepository pLanguageTechnologyRepository;
	
	
	@Autowired
	public PLanguageTechnologyManager(PLanguageTechnologyRepository pLanguageTechnologyRepository) {
		super();
		this.pLanguageTechnologyRepository = pLanguageTechnologyRepository;
	}

	@Override
	public void add(ProgrammingLanguageTechnology programmingLanguageTechnology) {
		try {
			pLanguageTechnologyRepository.save(programmingLanguageTechnology);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void update(ProgrammingLanguageTechnology programmingLanguageTechnology) {
		
		try {
			pLanguageTechnologyRepository.save(programmingLanguageTechnology);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void delete(int id) {
		try {
			pLanguageTechnologyRepository.deleteById(id);;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public ProgrammingLanguageTechnology getById(int id) {
		
		try {
			return pLanguageTechnologyRepository.findById(id).get();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<ProgrammingLanguageTechnology> getAll() {
		
		try {
			return pLanguageTechnologyRepository.findAll();
		} catch (Exception e) {
			return null;
		}
	}

}
