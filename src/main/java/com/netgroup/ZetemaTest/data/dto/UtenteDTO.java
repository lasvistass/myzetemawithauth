package com.netgroup.ZetemaTest.data.dto;

import com.netgroup.ZetemaTest.data.entity.Documento;
import com.netgroup.ZetemaTest.data.entity.Genere;

import lombok.Data;

@Data
public class UtenteDTO {

	private String nome;
	
	private String cognome;
	
	private Genere genere;
	
	private Documento documento;
	
	private String numeroDocumento;

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
