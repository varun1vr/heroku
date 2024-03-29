package com.varun.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("")
public class AuthenticationController{
  private LoginResponse loginResponse= new LoginResponse();
  @PostMapping("/login")
    public LoginResponse login(@RequestBody @Valid LoginRequest loginRequest){
      if(loginRequest.getEmail().equals("barun"))
      {
        loginResponse.setName(loginRequest.getEmail());
        loginResponse.setStatus(true);
          return loginResponse;
      }else {
        loginResponse.setName(loginRequest.getEmail());
        loginResponse.setStatus(false);
        return loginResponse;}
    }
}
