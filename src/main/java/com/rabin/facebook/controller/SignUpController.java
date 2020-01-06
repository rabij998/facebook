package com.rabin.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabin.facebook.entity.SignUpEntity;
import com.rabin.facebook.service.SignUpService;

@RestController
@RequestMapping("/facebook")
public class SignUpController {
	@Autowired
private SignUpService signUpService;
	@RequestMapping(value = "/singup",method = RequestMethod.POST)
	public SignUpEntity createUser(@RequestBody SignUpEntity signUpEntity)
	{
	/*	SignUpEntity user=signUpService.getUserByEmail(signUpEntity.getEmail());
		if(user==null)*/
			return signUpService.createUser(signUpEntity);
		/*
		 * else return null;
		 */
	}
}
