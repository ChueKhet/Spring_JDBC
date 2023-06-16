package com.ojt.crud.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.ojt.crud.bl.service.post.impl.PostService;
import com.ojt.crud.persistence.dao.entity.Post;

@Controller
public class PostController {
	@Autowired
	PostService service;
	
	@GetMapping("/post")
	List<Post>getAll(){
		return service.getAll();
	}
}
