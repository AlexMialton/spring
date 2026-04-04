package spring.listener;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {

    private AccessType accessType;

    public AccessType getAccessType() {
        return accessType;
    }

    public Event(Object source, AccessType accessType) {
        super(source);
        this.accessType = accessType;
    }
}
