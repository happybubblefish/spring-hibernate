package org.finra.springboothibernate.service.PostServiceImpl;

import java.util.Optional;

import org.finra.springboothibernate.model.Post;
import org.finra.springboothibernate.repository.PostRepository;
import org.finra.springboothibernate.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public Optional<Post> findById(Long id) {
		return postRepository.findById(id);
	}

	@Override
	public Post addPost(Post post) {
		return postRepository.save(post);
	}

}
