package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurClientClass {

    public static void main( String[] args ) {
        SpringApplication.run(EurClientClass.class, args);
    }

}
