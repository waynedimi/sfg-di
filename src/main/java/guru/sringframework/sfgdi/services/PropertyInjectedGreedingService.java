package guru.sringframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreedingService implements GreetingService {

    @Override
    public String sayGreeting() {
        // TODO Auto-generated method stub
        return "Hello World - Property";
    }

}