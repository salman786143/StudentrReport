package com.sfss.StudentReportSystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentReportController {

    @RequestMapping("/hello/")
    public String helloWorld(){
        return "Hello Sam";
    }

}
