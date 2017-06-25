package io.nav.entity;

import javafx.scene.layout.Priority;
import org.springframework.stereotype.Component;

/**
 * Created by navanee on 24-06-2017.
 */

@Component
public class AlertType {

    private String id;
    private String description;
    private Priority priority;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
