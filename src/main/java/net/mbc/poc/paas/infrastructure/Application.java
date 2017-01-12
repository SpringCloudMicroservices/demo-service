package net.mbc.poc.paas.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by tri.bui on 9/12/16.
 */
@SpringBootApplication
@EnableFeignClients
@ComponentScan("net.mbc.poc")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
