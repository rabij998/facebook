package com.rabin.facebook.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rabin.facebook.entity.CommentEntity;
@Repository
public interface CommentRepository extends CrudRepository<CommentEntity, Integer> {
	public List<CommentEntity> findAllByPostEntityId(int post_id);

}
