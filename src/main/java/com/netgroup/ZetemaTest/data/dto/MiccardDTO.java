package com.netgroup.ZetemaTest.data.dto;

import com.netgroup.ZetemaTest.data.entity.Utente;
import java.util.Date;

public class MiccardDTO {

    private Date createDate;

    private Boolean isExpired;

    private Date expiredDate;

    private Date activationDate;

    private Boolean phisicalCard;

    private String miccardCode;

    private Utente utente;

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getExpired() {
        return isExpired;
    }

    public void setExpired(Boolean expired) {
        isExpired = expired;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Date getActivationDate() {
        return activationDate;
    }

    public void setActivationDate(Date activationDate) {
        this.activationDate = activationDate;
    }

    public Boolean getPhisicalCard() {
        return phisicalCard;
    }

    public void setPhisicalCard(Boolean phisicalCard) {
        this.phisicalCard = phisicalCard;
    }

    public String getMiccardCode() {
        return miccardCode;
    }

    public void setMiccardCode(String miccardCode) {
        this.miccardCode = miccardCode;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
}
