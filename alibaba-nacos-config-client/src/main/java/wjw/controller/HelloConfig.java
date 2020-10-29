package wjw.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : wangjianwei
 * @version : 1.0
 * @date : 2020/10/28 17:31
 **/
@Slf4j
@RefreshScope
@RestController
public class HelloConfig {

    @Value("${didispace.title:}")
    private String title;

    @GetMapping("/testHello")
    public String hello() {
       return title;
    }
}
