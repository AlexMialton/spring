package spring.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @EventListener(condition = "#p0.AccessType.name=='READ'")
    public void acceptEvent(Event event){
        System.out.println(event);
    }
}
