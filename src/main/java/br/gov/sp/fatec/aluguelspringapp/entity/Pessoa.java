package br.gov.sp.fatec.aluguelspringapp.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import br.gov.sp.fatec.aluguelspringapp.controller.View;

@Entity
@Table(name="pe_pessoa")
@AttributeOverride(name = "id", column = @Column(name = "pess_id"))
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa extends BaseEntity{
	
	@JsonView({View.AluguelResumo.class, View.PessoaResumo.class})
	@Column(name="pe_nome")
	private String nome;
	
	@JsonView({View.AluguelResumo.class, View.PessoaResumo.class})
	@Column(name="pe_email")
	private String email;
	
	@JsonView({View.AluguelResumo.class, View.PessoaResumo.class})
	@Column(name="pe_cpf")
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
}
