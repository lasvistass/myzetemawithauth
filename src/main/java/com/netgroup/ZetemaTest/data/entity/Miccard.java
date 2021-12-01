package com.netgroup.ZetemaTest.data.entity;

//import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
//@Data
public class Miccard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column
    private Date createDate;

    @Column
    private Boolean isExpired;

    @Column
    private Date expiredDate;

    @Column
    private Date activationDate;

    @Column
    private Boolean phisicalCard;

    @Column
    private String miccardCode;

    @ManyToOne
    @JoinColumn
    private Utente utente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getIsExpired() {
        if(expiredDate.getTime()>new Date().getTime()){
            isExpired = false;
        }else{
            isExpired = true;
        }
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
