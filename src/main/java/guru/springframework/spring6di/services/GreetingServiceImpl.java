package guru.springframework.spring6di.services;

// created by kp on 3/19/2023

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello Everyone From Base Service!!!";
    }
}
