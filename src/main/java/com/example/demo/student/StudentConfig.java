package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
           Student jaimie =  new Student(
                    "Jaimie",
                    "jaimie.lannister@gmail.com",
                    LocalDate.of(2000, APRIL,24)
            );
           Student roger =  new Student(
                    "roger",
                    "roger.federer@gmail.com",
                    LocalDate.of(1989, MARCH,24)
            );

           repository.saveAll(List.of(jaimie,roger));
        };
    }
}
