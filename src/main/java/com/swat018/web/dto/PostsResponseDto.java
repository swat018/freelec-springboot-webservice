package com.swat018.web.dto;

import com.swat018.domain.posts.Posts;
import lombok.Getter;

/**
 * @author jinwoopark
 */
@Getter
public class PostsResponseDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
