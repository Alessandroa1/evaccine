package br.com.alessandro.sa.service;

import br.com.alessandro.sa.domain.Usuario;
import br.com.alessandro.sa.dto.DetalhesUsuario;
import br.com.alessandro.sa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Optional;

public class AutenticacaoUsuarioService implements UserDetailsService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Usuario> usuario = usuarioRepository.findByLogin(username);

        if (usuario.isEmpty()){
            throw new UsernameNotFoundException("Usuário não encontrado");
        }
        return new DetalhesUsuario(usuario.get());
    }
}