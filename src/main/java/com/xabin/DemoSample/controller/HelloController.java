package com.xabin.DemoSample.controller;

import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

/*
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
*/
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }


    @RequestMapping("/json")
    @ResponseBody
    public Map<String,Object> json() {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("name","Ryan");
        map.put("age","18");
        map.put("sex","man");
        return map;
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}
