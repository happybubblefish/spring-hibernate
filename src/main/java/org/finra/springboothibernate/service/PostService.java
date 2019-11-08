package org.finra.springboothibernate.service;

import java.util.Optional;

import org.finra.springboothibernate.model.Post;

public interface PostService {
	public Optional<Post> findById(Long id);
	public Post addPost(Post post);
}
