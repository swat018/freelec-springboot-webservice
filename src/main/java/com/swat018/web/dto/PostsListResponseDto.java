package com.swat018.web.dto;

import com.swat018.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * @author jinwoopark
 */
@Getter
public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
