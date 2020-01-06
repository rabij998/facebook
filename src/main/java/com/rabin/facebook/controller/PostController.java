package com.rabin.facebook.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rabin.facebook.entity.PostEntity;
import com.rabin.facebook.entity.SignUpEntity;
import com.rabin.facebook.service.PostService;
@RestController
@RequestMapping("/facebook")
public class PostController {
	
	private PostService postService;
	@RequestMapping(value="/signin/{id}/post",method = RequestMethod.POST)
	public void createPost(@PathVariable int id,@RequestBody PostEntity postEntity)
	{
		postEntity.setSignUpEntity(new SignUpEntity(id,"","",""));
		postService.createPost(postEntity);
	}
	@RequestMapping(value="/post",method = RequestMethod.GET)
	public List<PostEntity> getAllPost()
	{
		return postService.getAllPost();
	}
	@RequestMapping(value="/signin/{user_id}/post/{id}",method = RequestMethod.GET)
	public PostEntity getPost(@PathVariable int id)
	{
		
		return postService.findPost(id);
	}
	@RequestMapping(value="/signin/{user_id}/post/{id}",method = RequestMethod.DELETE)
	public void deletePost(int id)
	{
	postService.deletePost(id);	
	}

}
