package com.rabin.facebook.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabin.facebook.entity.CommentEntity;
import com.rabin.facebook.entity.PostEntity;
import com.rabin.facebook.entity.SignUpEntity;
import com.rabin.facebook.service.CommentService;

@RestController
@RequestMapping("/facebook")
public class CommentController {
	private CommentService commentService;
	@RequestMapping(value="/signin/{user_id}/post/{post_id}/comments",method = RequestMethod.POST)
	public CommentEntity addComment(@PathVariable int post_id,@RequestBody CommentEntity comment)
	{
		comment.setPostEntity(new PostEntity(post_id,"",true,new SignUpEntity()));
		return commentService.saveComment(comment);
		
	}
	@RequestMapping(value="/signin/{user_id}/post/{post_id}/comments",method = RequestMethod.POST)
	public List<CommentEntity> findComments(@PathVariable int post_id)
	{
		return commentService.findComments(post_id);
	}

}
