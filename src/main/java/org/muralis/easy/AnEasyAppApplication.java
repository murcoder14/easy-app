package org.muralis.easy;

import org.muralis.easy.dto.Bozo;
import org.muralis.easy.repository.BozosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Duration;
import java.util.Arrays;

@SpringBootApplication
public class AnEasyAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnEasyAppApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BozosRepository repository) {
        return (args) -> repository.saveAll(Arrays.asList(
                        new Bozo("TM", 19.99), new Bozo("SB", 29.99), new Bozo("AV", 39.99)))
                .blockLast(Duration.ofSeconds(10));
    }

}
