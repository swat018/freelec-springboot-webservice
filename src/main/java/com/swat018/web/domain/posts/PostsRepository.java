package com.swat018.web.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jinwoopark
 */
public interface PostsRepository extends JpaRepository<Posts,Long> {
}
