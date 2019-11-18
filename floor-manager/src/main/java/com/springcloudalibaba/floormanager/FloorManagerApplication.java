package com.springcloudalibaba.floormanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author www
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.springcloudalibaba.floormanager.mapper")
public class FloorManagerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FloorManagerApplication.class, args);
    }

}
