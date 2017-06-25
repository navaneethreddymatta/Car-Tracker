package io.nav.entity;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by navanee on 24-06-2017.
 */

@Component
public class Priority {

    private String id;
    private String name;

    public Priority() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
