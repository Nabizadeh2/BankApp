package com.atl23.bankapp.controller;

import com.atl23.bankapp.dto.UserRequest;
import com.atl23.bankapp.service.UserRabService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/rabbit")
@RestController
@RequiredArgsConstructor
public class UserRabbitController {

private final UserRabService userRabService;

 @PostMapping
    public String addUserRab(@RequestBody UserRequest userRequest){
     return userRabService.addUser(userRequest);
 }
}
