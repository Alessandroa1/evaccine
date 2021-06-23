package br.com.alessandro.sa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alessandro.sa.domain.Agenda;

public interface AgendaRepository extends JpaRepository <Agenda, Long> {

}
