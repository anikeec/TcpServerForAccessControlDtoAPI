/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apu.TcpServerForAccessControlDtoAPI;

import java.beans.Transient;
import java.io.Serializable;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.NonFinal;

/**
 *
 * @author apu
 */
@Value
public class CardDto implements Serializable, ActivatableEntity, VisualizableEntity {

    private static final long serialVersionUID = 1L;    
    private Integer cardId;
    private String cardNumber;
    @NonFinal
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Boolean active = false;
    @NonFinal
    private Integer userId;

    public CardDto(Integer cardId, String cardNumber, Boolean active, Integer userId) {
        super();
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.active = active;
        this.userId = userId;
    }

    public CardDto(Integer cardId) {
        this(cardId, null, false, null);
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
    
    public Integer getId() {
        return this.getCardId();
    }

    @Transient
    public String getDescription() {
        return this.getCardId() + " - " + this.getCardNumber();
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
    
}
