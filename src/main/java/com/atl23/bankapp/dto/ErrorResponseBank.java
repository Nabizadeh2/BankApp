package com.atl23.bankapp.dto;

import com.atl23.bankapp.BankStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponseBank {

    private BankStatus status;
    private String message;
}
