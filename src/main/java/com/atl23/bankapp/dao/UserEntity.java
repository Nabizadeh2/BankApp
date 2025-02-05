package com.atl23.bankapp.dao;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;

    private String password;

    @ManyToOne
    @JoinColumn(name = "bank_id")
    private BankEntity bank;

}
