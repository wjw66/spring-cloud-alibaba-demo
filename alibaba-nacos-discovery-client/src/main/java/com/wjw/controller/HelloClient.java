package com.wjw.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author : wangjianwei
 * @version : 1.0
 * @date : 2020/10/28 17:31
 **/
@Slf4j
@RestController
public class HelloClient {
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/testHello")
    public String hello() {
        //获取服务节点
        ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-nacos-discovery-server");
        //拼接url
        String url = serviceInstance.getUri() + "hello?name=" + "wjw";
        RestTemplate restTemplate = new RestTemplate();
        //通过url发起远程调用，返回string类型对象
        String result = restTemplate.getForObject(url, String.class);
        return "Invoke:" + url + ",return : " + result;
    }
}
