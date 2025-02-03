package com.atl23.bankapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponseBank {

    private String errorCode;
    private String errorMessage;
}
