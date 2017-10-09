package com.dexter.camel.model.mongo;

import org.springframework.data.annotation.Id;

public class MongoEvent {

    @Id
    public String id;

    public String event;

    public MongoEvent() {}

    public MongoEvent(String xml) {
        this.event = xml;
    }

    @Override
    public String toString() {
        return "MongoEvent{" +
                "id='" + id + '\'' +
                ", acts='" + event + '\'' +
                '}';
    }
}
