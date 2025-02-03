package com.atl23.bankapp.controller;

import com.atl23.bankapp.dao.BankEntity;
import com.atl23.bankapp.dao.UserEntity;
import com.atl23.bankapp.exception.ResourceNotFoundException;
import com.atl23.bankapp.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banks")
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    @GetMapping
    public List<BankEntity> getAllBanks() {
        return bankService.getAllBanks();
    }

    @PostMapping
    public BankEntity saveBank(@RequestBody BankEntity bankEntity) {
        return bankService.saveBank(bankEntity);
    }

    @GetMapping("/{id}")
    public BankEntity getBankById(@PathVariable Long id) {
        return bankService.getBankById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Bank not found with id: " + id));
    }

    @GetMapping("/{bankId}/users")
    public List<UserEntity> getUsersByBankId(@PathVariable Long bankId) {
        return bankService.getUsersByBankId(bankId);
    }

}
