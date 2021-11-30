package com.netgroup.ZetemaTest.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Utente")
@Data
public class Utente {


	@Id
	@Column(name ="idUtente")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idUtente;
	
	@Column(name ="Nome")
	private String nome;
	
	@Column(name ="Cognome")
	private String cognome;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="Genere")
	private Genere genere;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="Documento")
	private Documento documento;
	
	@Column(name ="NumeroDocumento")
	private String numeroDocumento;

	public Integer getIdUtente() {
		return idUtente;
	}

	public void setIdUtente(Integer idUtente) {
		this.idUtente = idUtente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Genere getGenere() {
		return genere;
	}

	public void setGenere(Genere genere) {
		this.genere = genere;
	}

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
	
}
