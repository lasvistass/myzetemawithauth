package com.netgroup.ZetemaTest.data.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.netgroup.ZetemaTest.data.entity.Giftcard;
import com.netgroup.ZetemaTest.data.entity.Miccard;
import com.netgroup.ZetemaTest.data.entity.PaymentType;
import com.netgroup.ZetemaTest.data.entity.Store;
import com.netgroup.ZetemaTest.data.entity.Utente;

public class OrdineDTO {

	private Date timeStamp;
	
	private String code;
	
	private boolean isBilled;
	
	private Integer prezzo;

	private PaymentType paymentType;
	
	private String campo1;
	
	private Utente utente;
	
	private Miccard micard;
	
	private Giftcard giftcard;
	
	private Store store;
	

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
