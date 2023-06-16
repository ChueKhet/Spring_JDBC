package com.ojt.crud.persistence.dao.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="post")
@Getter
@Setter

public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	
	@Column(nullable=false)
	public String title;
	
	public String description;
	
	@Column(nullable=true)
	public LocalDateTime created_At;

	public LocalDateTime updated_At;
	
	public Post() {
		
	}

	public Post(int id, String title, String description, LocalDateTime created_At, LocalDateTime updated_At) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.created_At = created_At;
		this.updated_At = updated_At;
	}
	
}
