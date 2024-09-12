package com.automata.testing.framework.post.events;

import com.automata.testing.framework.post.model.PostEntity;
import org.springframework.context.ApplicationEvent;

public class PostCreatedEvent extends ApplicationEvent {
    private final PostEntity post;

    public PostCreatedEvent(Object source, PostEntity post) {
        super(source);
        this.post = post;
    }

    public PostEntity getPost() {
        return post;
    }
}