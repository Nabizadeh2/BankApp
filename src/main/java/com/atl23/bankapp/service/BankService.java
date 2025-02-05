package com.atl23.bankapp.service;

import com.atl23.bankapp.dto.BankResponseDto;
import com.atl23.bankapp.dto.UserRequestDto;

import java.util.List;



public interface BankService {

    List<BankResponseDto> getall();
    BankResponseDto getById(Long id);
    void addUsers(UserRequestDto dto);
}
