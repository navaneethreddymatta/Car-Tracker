package io.nav.entity;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by navanee on 24-06-2017.
 */

@Component
public class Alert {

    private String id;
    private Reading reading;
    private AlertType type;

    public Alert() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Reading getReading() {
        return reading;
    }

    public void setReading(Reading reading) {
        this.reading = reading;
    }

    public AlertType getType() {
        return type;
    }

    public void setType(AlertType type) {
        this.type = type;
    }
}
