package com.rest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AllApplication {

    public static void main(String[] args) {
        SpringApplication.run(AllApplication.class, args);
    }


    @Bean
    CommandLineRunner initDatabase(BookRepository repository){
        return args -> {
            repository.save(new Book("A Guide to the Bodhisattva Way of Life", "Santideva", new Integer("15")));
            repository.save(new Book("The Life-Changing Magic of Tidying Up", "Marie Kondo", new Integer("9")));
            repository.save(new Book("Refactoring: Improving the Design of Existing Code", "Martin Fowler", new Integer("47")));
        };
    }
}
