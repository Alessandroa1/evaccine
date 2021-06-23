package br.com.alessandro.sa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alessandro.sa.repository.PessoaRepository;
@RestController
@RequestMapping("/login")
@CrossOrigin(origins = { "http://localhost:3000"})

public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

}
