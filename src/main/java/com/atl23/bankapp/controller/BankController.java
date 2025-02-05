package com.atl23.bankapp.controller;
import com.atl23.bankapp.dao.BankEntity;
import com.atl23.bankapp.dao.UserEntity;
import com.atl23.bankapp.dto.BankResponseDto;
import com.atl23.bankapp.dto.UserRequestDto;
import com.atl23.bankapp.exception.ResourceNotFoundException;
import com.atl23.bankapp.service.BankService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/banks")
@RequiredArgsConstructor
public class BankController {

    private final BankService bankService;

    @PostMapping("add")
    public void addUsers(@Valid @RequestBody UserRequestDto dto){
        bankService.addUsers(dto);
    }
    @GetMapping("/get")
    public List<BankResponseDto> getAll(){
        return bankService.getall();
    }
    @GetMapping("/get/{id}")
    public BankResponseDto getById(@PathVariable Long id){
        return bankService.getById(id);
    }
}