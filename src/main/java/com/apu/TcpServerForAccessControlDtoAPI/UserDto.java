package com.apu.TcpServerForAccessControlDtoAPI;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class UserDto implements Serializable, ActivatableEntity {

    private static final long serialVersionUID = 1L;  
    private Integer userId;
    private String firstName;
    private String secondName;
    private String phoneNumber;
    private String email;
    private String password;
    private Boolean active = false;
    private Collection<String> cardCollection;
    private List<String> roleUserCollection;
  
    public UserDto() {
        super();
    }

    public UserDto(Integer userId, String firstName, String secondName, String phoneNumber, String email,
            String password, Boolean active, Collection<String> cardCollection, List<String> roleUserCollection) {
        this();
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
    
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Collection<String> getCardCollection() {
        return cardCollection;
    }
    public void setCardCollection(Collection<String> cardCollection) {
        this.cardCollection = cardCollection;
    }
    public List<String> getRoleUserCollection() {
        return roleUserCollection;
    }
    public void setRoleUserCollection(List<String> roleUserCollection) {
        this.roleUserCollection = roleUserCollection;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
  
  
    
}
