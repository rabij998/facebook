package com.rabin.facebook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rabin.facebook.entity.PostEntity;
import com.rabin.facebook.repository.PostRepository;

@Service
public class PostService {
	@Autowired
	private PostRepository postRepository;
	public void createPost(PostEntity postEntity)
	{
		postRepository.save(postEntity);
	}
	public List<PostEntity> getAllPost() {
		List<PostEntity> posts=new ArrayList<PostEntity>();
		postRepository.findAll().forEach(posts::add);
		return posts;
	}
	public PostEntity findPost(int id)
	{
		return postRepository.findById(id).get();
	}
	public void deletePost(int id)
	{
		postRepository.deleteById(id);
	}

}
