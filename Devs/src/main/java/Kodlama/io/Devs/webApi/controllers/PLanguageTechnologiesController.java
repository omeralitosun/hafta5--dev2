package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.PLanguageTechnologyService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

@RestController
@RequestMapping("/api/languagetechnologies")
public class PLanguageTechnologiesController {
	private PLanguageTechnologyService pLanguageTechnologyService;

	@Autowired
	public PLanguageTechnologiesController(PLanguageTechnologyService pLanguageTechnologyService) {
		super();
		this.pLanguageTechnologyService = pLanguageTechnologyService;
	}
	
	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguageTechnology programmingLanguageTechnology) {
		pLanguageTechnologyService.add(programmingLanguageTechnology);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody ProgrammingLanguageTechnology programmingLanguageTechnology) {
		pLanguageTechnologyService.update(programmingLanguageTechnology);
	}
	
	@PostMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		pLanguageTechnologyService.delete(id);
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguageTechnology> getAll(){
		return pLanguageTechnologyService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public ProgrammingLanguageTechnology getById(@PathVariable("id") int id) {
		return pLanguageTechnologyService.getById(id);
	}
}
