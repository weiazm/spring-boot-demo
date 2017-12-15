package cn.vonyan.demo.springboot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weihongyan
 * @implNote <(▰˘◡˘▰)>
 * @since 15/12/2017 11:31 AM
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello.json")
    public Map<String, ?> helloWorld() {
        Map<String, Object> map = new HashMap<>();
        map.put("result", "helloworld");
        return map;
    }
}
