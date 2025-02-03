package com.atl23.bankapp.service;

import com.atl23.bankapp.dao.BankEntity;
import com.atl23.bankapp.dao.BankRepository;
import com.atl23.bankapp.dao.UserEntity;
import com.atl23.bankapp.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BankService {


    private final BankRepository bankRepository;

    public List<BankEntity> getAllBanks() {
        return bankRepository.findAll();
    }

    public BankEntity saveBank(BankEntity bank) {
        return bankRepository.save(bank);
    }

    public Optional<BankEntity> getBankById(Long id) {
        return bankRepository.findById(id);
    }

    public List<UserEntity> getUsersByBankId(Long bankId) {
        return bankRepository.findById(bankId)
                .orElseThrow(() -> new ResourceNotFoundException("Bank not found with id: " + bankId))
                .getUserEntities();
    }
}
