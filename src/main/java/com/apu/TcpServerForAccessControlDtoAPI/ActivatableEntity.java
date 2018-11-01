package com.apu.TcpServerForAccessControlDtoAPI;

public interface ActivatableEntity extends AccessControlEntity {
    
    Boolean getActive();

    void setActive(Boolean active);
    
}
