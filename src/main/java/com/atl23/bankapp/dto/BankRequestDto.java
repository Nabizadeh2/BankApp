package com.atl23.bankapp.dto;

import com.atl23.bankapp.dao.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class BankRequestDto {
    private String name;
    private List<UserEntity> userEntityList;
}
