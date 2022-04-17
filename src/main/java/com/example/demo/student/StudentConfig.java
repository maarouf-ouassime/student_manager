package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
                  Student ouassime =   new Student(
                            "Ouassime",
                            "Ouassime@gmail.com",
                            LocalDate.of(1997, Month.JUNE,9)

                    );
            Student ali =   new Student(
                    "Ali",
                    "Ali@gmail.com",
                    LocalDate.of(1996, Month.JUNE,19)

            );
        repository.saveAll(List.of(ouassime,ali));
        };
    }
}
