package com.rabin.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="post")
public class PostEntity {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="post_name")
	private String postName;
	@Column(name="is_active")
	private boolean status;
	@OneToOne
	private SignUpEntity signUpEntity;
	
	public PostEntity(int id, String postName, boolean status, SignUpEntity signUpEntity) {
		super();
		this.id = id;
		this.postName = postName;
		this.status = status;
		this.signUpEntity = signUpEntity;
	}
	public PostEntity(int id, String postName, String email,String pwd) {
		super();
		this.id = id;
		this.postName = postName;
		this.status = false;
		this.signUpEntity = new SignUpEntity("email","pwd");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public SignUpEntity getSignUpEntity() {
		return signUpEntity;
	}
	public void setSignUpEntity(SignUpEntity signUpEntity) {
		this.signUpEntity = signUpEntity;
	}
	
	

}
