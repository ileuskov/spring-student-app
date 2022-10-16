package com.springproject.springStudentProject.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
CommandLineRunner commandLineRunner(
        StudentRepository repository) {
    return args -> {
               Student Ivan =  new Student(
                        1L,
                        "Ivan",
                        "ivan.leuskov@gmail.com",
                        LocalDate.of(1972, 10, 17),
                        50
                );

        Student John =  new Student(
                "John",
                "John.johnson@gmail.com",
                LocalDate.of(1982, 11, 15),
                40
        );

        //saves our students to the database
        repository.saveAll(
                List.of(Ivan, John)
        );
    };
}
}
