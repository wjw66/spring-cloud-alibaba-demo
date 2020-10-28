package com.wjw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author : wangjianwei
 * @version : 1.0
 * @date : 2020/10/28 15:44
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class CloudAlibabaNacosApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudAlibabaNacosApplication.class, args);
    }
}
