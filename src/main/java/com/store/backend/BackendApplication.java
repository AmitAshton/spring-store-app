package com.store.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
/**
 * this class runs our backend application using spring
 */
@SpringBootApplication
@EntityScan("com.store.backend.data.model")
@EnableJpaRepositories("com.store.backend.repository.sql")
@EnableRedisRepositories("com.store.backend.repository.redis")
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}
