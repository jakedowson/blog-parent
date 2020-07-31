package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by lenovo on 2020/7/1.
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.itheima")
@EntityScan("com.itheima.pojo")
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class);
    }
}
