package com.rabin.facebook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rabin.facebook.entity.PostEntity;
@Repository
public interface PostRepository extends CrudRepository<PostEntity, Integer> {

}
