package br.com.alessandro.sa.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessandro.sa.domain.Agenda;
import br.com.alessandro.sa.repository.AgendaRepository;

@RestController
@RequestMapping("/agendas")
@CrossOrigin(origins = { "http://localhost:3000"})
//@RolesAllowed(value={"ADMIN","USER"})
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
	public Agenda cadastarVacinacao (@RequestBody Agenda agenda) {
		return agendaRepository.save(agenda);
	}
	
	@PutMapping("{codigo}")
	public Agenda atualizar(@PathVariable("codigo")Long codigo, @RequestBody Agenda agenda) {
		return agendaRepository.findById(codigo).map(
				record -> {
					record.setNomePaciente(agenda.getNomePaciente());
					record.setDataAgendamento(agenda.getDataAgendamento());
					record.setHoraAgendamento(agenda.getHoraAgendamento());
					record.setNomeVacina(agenda.getNomeVacina());
					record.setDose(agenda.getDose());
					record.setLaboratorio(agenda.getLaboratorio());	
					record.setEndereco(agenda.getEndereco());	
					return agendaRepository.save(record);
				}).orElse(null);
	}	

	@DeleteMapping(path ={"/{codigo}"})
	public void delete(@PathVariable long codigo) {
		agendaRepository.findById(codigo).ifPresent(a -> agendaRepository.deleteById(a.getCodigo()));       
	            
	     }      
 	}	
	
