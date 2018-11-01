/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.TcpServerForAccessControlDtoAPI;

import java.beans.Transient;
import java.io.Serializable;

/**
 *
 * @author apu
 */
public class CardDto implements Serializable, ActivatableEntity, VisualizableEntity {

    private static final long serialVersionUID = 1L;
    private Integer cardId;
    private String cardNumber;
    private Boolean active = false;
    private Integer userId;

    public CardDto() {
    }

    public CardDto(Integer cardId, String cardNumber, Boolean active, Integer userId) {
        super();
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.active = active;
        this.userId = userId;
    }

    public CardDto(Integer cardId) {
        this.cardId = cardId;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cardId != null ? cardId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CardDto)) {
            return false;
        }
        CardDto other = (CardDto) object;
        if ((this.cardId == null && other.cardId != null) || (this.cardId != null && !this.cardId.equals(other.cardId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.apu.TcpServerForAccessControlAPI.rest.Card[ cardId=" + cardId + " ]";
    }

    public Integer getId() {
        return this.getCardId();
    }

    @Transient
    public String getDescription() {
        return this.getCardId() + " - " + this.getCardNumber();
    }
    
}
