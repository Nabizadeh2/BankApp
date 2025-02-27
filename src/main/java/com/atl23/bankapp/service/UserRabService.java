package com.atl23.bankapp.service;

import com.atl23.bankapp.config.RabbitMQProducer;
import com.atl23.bankapp.dao.UsersRepository;
import com.atl23.bankapp.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRabService {
    private final UsersRepository usersRepository;
    private  final RabbitMQProducer<UserRequest> rabbitMQProducer;

    public String addUser(UserRequest userRequest){
     rabbitMQProducer.sendMessage(userRequest);
     return "success";
    }
}
