package wjw.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wangjianwei
 * @version : 1.0
 * @date : 2020/10/28 15:46
 **/
@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello.rocketMq";
    }
}
