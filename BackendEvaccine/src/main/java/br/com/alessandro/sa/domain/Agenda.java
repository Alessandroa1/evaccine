package br.com.alessandro.sa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	private String nomePaciente;
	
	private String dataAgendamento;
	
	private String horarioAgendamento;
	
	private String nomeVacina;
	
	public String getDataAgendamento() {
		return dataAgendamento;
	}

	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}

	public String getHorarioAgendamento() {
		return horarioAgendamento;
	}

	public void setHorarioAgendamento(String horarioAgendamento) {
		this.horarioAgendamento = horarioAgendamento;
	}

	public String getNomeVacina() {
		return nomeVacina;
	}

	public void setNomeVacina(String nomeVacina) {
		this.nomeVacina = nomeVacina;
	}

	private String dose;

	private String nomeDoPaciente;

	private String nomeDaVacina;
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((dataAgendamento == null) ? 0 : dataAgendamento.hashCode());
		result = prime * result + ((dose == null) ? 0 : dose.hashCode());
		result = prime * result + ((horarioAgendamento == null) ? 0 : horarioAgendamento.hashCode());
		result = prime * result + ((nomeDaVacina == null) ? 0 : nomeDaVacina.hashCode());
		result = prime * result + ((nomeDoPaciente == null) ? 0 : nomeDoPaciente.hashCode());
		result = prime * result + ((nomePaciente == null) ? 0 : nomePaciente.hashCode());
		result = prime * result + ((nomeVacina == null) ? 0 : nomeVacina.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agenda other = (Agenda) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (dataAgendamento == null) {
			if (other.dataAgendamento != null)
				return false;
		} else if (!dataAgendamento.equals(other.dataAgendamento))
			return false;
		if (dose == null) {
			if (other.dose != null)
				return false;
		} else if (!dose.equals(other.dose))
			return false;
		if (horarioAgendamento == null) {
			if (other.horarioAgendamento != null)
				return false;
		} else if (!horarioAgendamento.equals(other.horarioAgendamento))
			return false;
		if (nomeDaVacina == null) {
			if (other.nomeDaVacina != null)
				return false;
		} else if (!nomeDaVacina.equals(other.nomeDaVacina))
			return false;
		if (nomeDoPaciente == null) {
			if (other.nomeDoPaciente != null)
				return false;
		} else if (!nomeDoPaciente.equals(other.nomeDoPaciente))
			return false;
		if (nomePaciente == null) {
			if (other.nomePaciente != null)
				return false;
		} else if (!nomePaciente.equals(other.nomePaciente))
			return false;
		if (nomeVacina == null) {
			if (other.nomeVacina != null)
				return false;
		} else if (!nomeVacina.equals(other.nomeVacina))
			return false;
		return true;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getDataDoAgendamento() {
		return dataAgendamento;
	}

	public void setDataDoAgendamento(String dataDoAgendamento) {
		this.dataAgendamento = dataDoAgendamento;
	}

	public String getHorarioDoAgendamento() {
		return horarioAgendamento;
	}

	public void setHorarioDoAgendamento(String horarioDoAgendamento) {
		this.horarioAgendamento = horarioDoAgendamento;
	}


	public String getNomeDaVacina() {
		return nomeDaVacina;
	}

	public void setNomeDaVacina(String nomeDaVacina) {
		this.nomeDaVacina = nomeDaVacina;
	}

	public String getDose() {
		return dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getNomeDoPaciente() {
		return nomeDoPaciente;
	}

	public void setNomeDoPaciente(String nomeDoPaciente) {
		this.nomeDoPaciente = nomeDoPaciente;
	}

	public String getNomePaciente() {
		return nomePaciente;
	}

	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	

}
