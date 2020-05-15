package com.wxs.rest.server.controller;

import com.wxs.rest.server.bo.Stu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 测试授权登陆流程
 */
@Slf4j
@RestController
@RequestMapping("/server")
public class ServerController {

    @GetMapping("/")
    public Map index() {
        log.info("server......");
        return Map.of("age",1,"name",1);
    }


    @GetMapping("/map")
    public Map map(@RequestParam("age")Integer age, @RequestParam("name") String name) {
        log.info("server......map,params age:{},name:{}",age,name);
        return Map.of("age",age,"name",name);
    }

    @PostMapping("/json")
    public Map json(@RequestBody Stu stu) {
        log.info("server......map,params stu:{}",stu);
        return Map.of("age",stu.getAge(),"name",stu.getName());
    }

    // @GetMapping("/map")
    // public Map map(Map map) {
    //     log.info("server......map:{}",map);
    //     return map;
    // }


    // @GetMapping("/uriVariables")
    // public Map uriVariables(@RequestParam("age")Integer age, @RequestParam("name") String name) {
    //     log.info("server......map,params age:{},name:{}",age,name);
    //     return Map.of("age",age,"name",name);
    // }

    @GetMapping("/uriVariables")
    public Map uriVariablesFalse(@RequestParam(value = "age",required = false)Integer age, @RequestParam(value = "name",required = false) String name) {
        log.info("server......map,params age:{},name:{}",age,name);
        return Map.of("age",null==age?1:age,"name",null==name?"ddd":name);
    }


}
