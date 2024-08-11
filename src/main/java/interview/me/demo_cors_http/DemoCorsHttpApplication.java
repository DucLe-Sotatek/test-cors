package interview.me.demo_cors_http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@SpringBootApplication
public class DemoCorsHttpApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoCorsHttpApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoCorsHttpApplication.class, args);
    }

    @GetMapping("/ok")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getUsers() {
        return Arrays.asList("Le", "Viet", "Duc");
    }

    @GetMapping("/bad-request")
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void badRequest() {
        log.info("API Bad Request is called");
    }

    @GetMapping("/internal-server-error")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public void internalServerError() {
        log.info("API internal server error is called");
    }

    @GetMapping("/unauthorized")
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public void unauthorized() {
        log.info("API Unauthorized is called");
    }

    @GetMapping("/forbidden")
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public void forbidden() {
        log.info("API forbidden is called");
    }

}
