package com.codeRabbit.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args ->{
            Student me = new Student(
                    "CodeRabbit",
                    "coderabbit@com.pl",
                    LocalDate.of(1999, 05, 05)
            );
            Student roman = new Student(
                    "Roman",
                    "roman@com.pl",
                    LocalDate.of(1995, 01, 05)
            );

            Student kosti = new Student(
                    "Kostek",
                    "kosti13@gmail.com.pl",
                    LocalDate.of(2013, 8, 23)
            );

            repository.saveAll(
                    List.of(me, roman, kosti)
            );
        };
    }
}
