package com.boxuegu.demo.record;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = {"com.boxuegu.demo"}, exclude = DataSourceAutoConfiguration.class)
public class RecordServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecordServiceApplication.class, args);
    }
}
