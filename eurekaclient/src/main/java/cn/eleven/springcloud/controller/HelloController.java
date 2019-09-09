package cn.eleven.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: Spring Boot 2.0 以后，actuator 默认只开启 health 和 info 端点，要使用 refresh 端点需要通过 management 指定。
 * @date: 2019-09-09 15:50
 * @author: 十一
 */
@RestController
@RefreshScope
public class HelloController {

    @Value("${server.port}")
    private int port;

    @RequestMapping("index")
    public String index() {
        return "Hello World!,端口：" + port;
    }
}
