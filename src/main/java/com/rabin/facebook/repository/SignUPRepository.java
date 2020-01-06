package com.rabin.facebook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rabin.facebook.entity.SignUpEntity;
@Repository
public interface SignUpRepository extends CrudRepository<SignUpEntity, Integer> {
	public SignUpEntity findByEmail(String email);

}
