package com.apu.TcpServerForAccessControlDtoAPI;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import lombok.Value;
import lombok.experimental.NonFinal;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Value
public class UserDto implements Serializable, ActivatableEntity {

    private static final long serialVersionUID = 1L;  
    private Integer userId;
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String email;
    private String password;
    @NonFinal
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Boolean active = false;
    private Collection<String> cardCollection;
    private List<String> roleUserCollection;

    public UserDto(Integer userId, String firstName, String secondName, String phoneNumber, String email,
            String password, Boolean active, Collection<String> cardCollection, List<String> roleUserCollection) {
        super();
        this.userId = userId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.active = active;
        this.cardCollection = cardCollection;
        this.roleUserCollection = roleUserCollection;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }  
    
}
