package com.atl23.bankapp.dto;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.List;


@Builder
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class BankResponseDto {
    private String name;
    private List<UserResponseDto> userEntityList;
}
