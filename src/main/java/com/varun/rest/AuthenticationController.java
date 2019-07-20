package com.varun.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("")
public class AuthenticationController{
  @PostMapping("/login")
    public String login(@RequestBody @Valid LoginRequest loginRequest){
      if(loginRequest.getEmail().equals("barun"))
      {
          return "true";
      }else return "false";
    }
}
