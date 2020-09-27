package com.swat018.config.auth.dto;

import com.swat018.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

/**
 * @author jinwoopark
 */
@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
