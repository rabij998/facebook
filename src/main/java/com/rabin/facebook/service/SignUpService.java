package com.rabin.facebook.service;

import org.springframework.stereotype.Service;

import com.rabin.facebook.entity.SignUpEntity;
import com.rabin.facebook.repository.SignUpRepository;

@Service
public class SignUpService {
	private SignUpRepository signUpRepository;
	public SignUpEntity getUserByEmail(String email)
	{
		return signUpRepository.findByEmail(email);
	}
	public SignUpEntity createUser(SignUpEntity signUpEntity)
	{
		return signUpRepository.save(signUpEntity);
	}
	

}
