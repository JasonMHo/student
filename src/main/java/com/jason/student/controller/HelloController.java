package com.jason.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

/**
 * @author jason
 * @date 2019-05-04  16:07:34
 */
@Controller
public class HelloController {

    @RequestMapping("/success")
    public String toSuccess(Map<String, Object> map){
        map.put("hello","<h1>这是jason</h1>");
        map.put("users", Arrays.asList("tom","jerry","bruce"));
        return "success";
    }

    @GetMapping("/hi")
    @ResponseBody
    public String sayHi(){
        return "hi, this is student management demo";
    }
}
