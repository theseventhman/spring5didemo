package myguru.springframework.didemo.services;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    public  GreetingServiceFactory(GreetingRepository greetingRepository){
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "ge":
                return new PrimaryGermanGreetingService(greetingRepository);
            case "sp":
                return new PrimarySpanishGreetingService(greetingRepository);
            default:
                return new PrimaryGermanGreetingService(greetingRepository);
        }

    }

}
