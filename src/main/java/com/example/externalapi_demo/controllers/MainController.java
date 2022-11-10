package com.example.externalapi_demo.controllers;

import com.example.externalapi_demo.entities.Activity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@RestController
public class MainController {
    @GetMapping("/hello")
    public String api1() {
        return "hello";
    }


    @GetMapping("/api1")
    public String api2() {
        String uri = "https://dummy.restapiexample.com/api/v1/employees";
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class);
        return result;
    }

    @GetMapping("/callApi")
    public int callApi1() {
        String uri = "https://dummy.restapiexample.com/api/v1/employees";
        RestTemplate restTemplate = new RestTemplate();
        Objects[] result =restTemplate.getForObject(uri, Objects[].class);

        return result.length;
    }

    @GetMapping("/randomActivity")
    public Activity callApi12() {
        String uri = "https://www.boredapi.com/api/activity";
        RestTemplate restTemplate = new RestTemplate();
//        Objects result = restTemplate.getForObject(uri, String.class);
        Activity result = restTemplate.getForObject(uri, Activity.class);
        System.out.println(result.toString());
        return result;
    }



}
