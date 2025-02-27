package com.atl23.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRequest implements Serializable {
   public static final long serialVersionUID = 42L;
    public String name;
}
