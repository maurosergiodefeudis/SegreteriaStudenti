package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

    @SpringBootApplication
    public class Main {
        public static void main(String[] args) {
            System.out.println("App Starting...");
            SpringApplication.run(org.example.Main.class, args);
        }

        @Bean
        public ObjectMapper getObjMapper(){
            return new ObjectMapper();
        }

    }