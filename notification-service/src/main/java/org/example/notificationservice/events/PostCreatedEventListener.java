package org.example.notificationservice.events;

import com.automata.testing.framework.post.events.PostCreatedEvent;
import com.automata.testing.framework.post.model.PostEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PostCreatedEventListener {

    @EventListener
    public void handlePostCreatedEvent(PostCreatedEvent event) {
        PostEntity post = event.getPost();
        log.info("event received for post creation: {}", post);
    }
}