package com.atl23.bankapp.service.impls;

import com.atl23.bankapp.dao.BankEntity;
import com.atl23.bankapp.dao.BankRepository;
import com.atl23.bankapp.dao.UserEntity;
import com.atl23.bankapp.dao.UsersRepository;
import com.atl23.bankapp.dto.BankResponseDto;
import com.atl23.bankapp.dto.UserRequestDto;
import com.atl23.bankapp.exception.BankNotFoundException;
import com.atl23.bankapp.mapper.BankMapper;
import com.atl23.bankapp.service.BankService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor

public class BankServiceİmpl implements BankService {

    private final BankRepository bankRepository;
    private final UsersRepository usersRepository;
    private final BankMapper bankMapper;

    @Override
    public List<BankResponseDto> getall() {
        return bankMapper.entityListToDto(bankRepository.findAll());
    }

    @Override
    public BankResponseDto getById(Long id) {
        return bankMapper.entityToDto(id);
    }

    @Override
    public void addUsers(UserRequestDto dto) throws BankNotFoundException {

        BankEntity bank = bankRepository.findById(dto.getBankId()).orElseThrow(() -> new BankNotFoundException("not found bank"));

        UserEntity entity = UserEntity.builder().name(dto.getName()).surname(dto.getSurname()).bankEntity(bank).build();
        usersRepository.save(entity);
    }
}
