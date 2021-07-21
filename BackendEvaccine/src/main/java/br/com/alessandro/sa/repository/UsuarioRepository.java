package br.com.alessandro.sa.repository;

import java.util.Optional;
import br.com.alessandro.sa.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
    

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);
}
