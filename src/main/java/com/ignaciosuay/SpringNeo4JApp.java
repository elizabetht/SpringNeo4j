package com.ignaciosuay;

import com.ignaciosuay.config.PersistenceContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by natxo on 17/12/16.
 */
@Configuration
@Import(PersistenceContext.class)
@SpringBootApplication
public class SpringNeo4JApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringNeo4JApp.class, args);
    }
}
