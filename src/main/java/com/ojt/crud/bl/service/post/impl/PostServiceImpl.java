package com.ojt.crud.bl.service.post.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ojt.crud.persistence.dao.entity.Post;

public class PostServiceImpl implements PostService{
	
	@Autowired
	public Post post;

	@Override
	public List<Post> getAll() {
		return null;
	}

}
