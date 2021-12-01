package com.netgroup.ZetemaTest.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Ordine")
public class Ordine {
	
	@Id
	@Column(name ="idOrdine")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idOrdine;
	
	@Column(name ="TimeStamp")
	private Date timeStamp;
	
	@Column(name ="Code")
	private String code;
	
	@Column(name ="IsBilled")
	private boolean isBilled;
	
	@Column(name ="Prezzo")
	private Integer prezzo;
	
	@Enumerated(EnumType.STRING)
	@Column(name ="PaymentType")
	private PaymentType paymentType;
	
	@Column(name ="Campo1")
	private String campo1;
	
	@ManyToOne
	@JoinColumn(name="idUtente")
	private Utente utente;
	
	@ManyToOne
	@JoinColumn(name="idMiccard")
	private Miccard micard;
	
	@ManyToOne
	@JoinColumn(name="idGiftcard")
	private Giftcard giftcard;
	
	@ManyToOne
	@JoinColumn(name="idStore")
	private Store store;

	public Integer getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(Integer idOrdine) {
		this.idOrdine = idOrdine;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isBilled() {
		return isBilled;
	}

	public void setBilled(boolean isBilled) {
		this.isBilled = isBilled;
	}

	public Integer getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Integer prezzo) {
		this.prezzo = prezzo;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public String getCampo1() {
		return campo1;
	}

	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public Miccard getMicard() {
		return micard;
	}

	public void setMicard(Miccard micard) {
		this.micard = micard;
	}

	public Giftcard getGiftcard() {
		return giftcard;
	}

	public void setGiftcard(Giftcard giftcard) {
		this.giftcard = giftcard;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	

}
