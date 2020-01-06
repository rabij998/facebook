package com.rabin.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="comment_box")
public class CommentEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="comment")
	private String comment;
	@ManyToOne
	private PostEntity postEntity;
	public CommentEntity(int id, String comment, int postId) {
		super();
		this.id = id;
		this.comment = comment;
		this.postEntity=new PostEntity(postId, "", "", "");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public PostEntity getPostEntity() {
		return postEntity;
	}
	public void setPostEntity(PostEntity postEntity) {
		this.postEntity = postEntity;
	} 
	

}
