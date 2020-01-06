package com.rabin.facebook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.rabin.facebook.entity.CommentEntity;
import com.rabin.facebook.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;

	public CommentEntity saveComment(CommentEntity comment) {
		return commentRepository.save(comment);
		
	}
	
	public List<CommentEntity> findComments(int post_id) {
		
		return commentRepository.findAllByPostEntityId(post_id);
	}

}
