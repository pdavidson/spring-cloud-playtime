package us.pdavidson.playtime.spring.clound;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PlaytimeService {
    private static final Logger log = LoggerFactory.getLogger(PlaytimeService.class);
    Random random = new Random();
    private final String [] MESSAGES= {
            "Hello Fool",
            "What's your birthday",
            "Coffee or Tea?",
            "Believe in Duke?"
    };
    public PlaytimeService() {
    }


    public String getMessage() {
        String message = MESSAGES[ Math.abs(random.nextInt()) % (MESSAGES.length - 1) ];

        try {
            Thread.sleep(Math.abs(random.nextInt()) % 1000);
        } catch (Exception e) {
            log.error("Error Sleeping", e);
        }

        return message;
    }

    public String getFallback() {
        return "We're hitting our Fallback";
    }


}
