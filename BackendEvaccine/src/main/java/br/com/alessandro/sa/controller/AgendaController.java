package br.com.alessandro.sa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessandro.sa.domain.Agenda;
import br.com.alessandro.sa.repository.AgendaRepository;

@RestController
@RequestMapping("/gruposprioritarios")
public class AgendaController {
	
	@Autowired
	private  AgendaRepository agendaRepository;
	
	@GetMapping
	public List<Agenda>listarTodos(){
		return agendaRepository.findAll();
	}
		
	@GetMapping("{codigo}")
	public Agenda buscarPeloCodigo(@PathVariable Long codigo) {
		return agendaRepository.findById(codigo).orElse(null);
	}
	
	@PostMapping
	public Agenda cadastarGrupoPrioritario (@RequestBody Agenda grupoPrioritario) {
		return agendaRepository.save(grupoPrioritario);
	}
}
