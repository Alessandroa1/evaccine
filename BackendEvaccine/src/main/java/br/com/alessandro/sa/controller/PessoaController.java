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

import br.com.alessandro.sa.domain.Pessoa;
import br.com.alessandro.sa.repository.PessoaRepository;

@RestController
@RequestMapping("/pessoas")
@CrossOrigin(origins = { "http://localhost:3000"})
public class PessoaController {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	@GetMapping
	public List<Pessoa> listarTodos(){
		return pessoaRepository.findAll();
	}
	
	@PostMapping
	public Pessoa cadastarPessoa (@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@PutMapping("{codigo}")
	public Pessoa atualizar(@PathVariable("codigo")Long codigo, @RequestBody Pessoa pessoa) {
		return pessoaRepository.findById(codigo).map(
				record -> {
					record.setCpf(pessoa.getCpf());
					record.setDataNascimento(pessoa.getDataNascimento());
					record.setEmail(pessoa.getEmail());
					record.setIdade(pessoa.getIdade());
					record.setNome(pessoa.getNome());
					record.setEndereço(pessoa.getEndereço());
					record.setTelefone(pessoa.getTelefone());
					record.setIsVacinada(pessoa.getIsVacinada());
					return pessoaRepository.save(record);
				}).orElse(null);
	}	
	
	@GetMapping("{codigo}")
	public Pessoa buscarPeloCodigo(@PathVariable Long codigo) {
		return pessoaRepository.findById(codigo).orElse(null);			
		}
	
	@DeleteMapping(path ={"/{codigo}"})
	public void delete(@PathVariable long codigo) {
		pessoaRepository.findById(codigo).ifPresent(a -> pessoaRepository.deleteById(a.getCodigo()));       
	            
	     } 
	}
	
	
	
	
	

