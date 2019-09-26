package com.hp.springclo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class SpringcloApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloApplication.class, args);
    }

}
