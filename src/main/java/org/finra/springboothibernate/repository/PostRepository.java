package org.finra.springboothibernate.repository;

import org.finra.springboothibernate.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends JpaRepository<Post, Long> {
	
	
}
