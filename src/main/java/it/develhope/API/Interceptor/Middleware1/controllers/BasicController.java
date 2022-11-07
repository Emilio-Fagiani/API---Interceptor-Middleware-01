package it.develhope.API.Interceptor.Middleware1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/time")
public class BasicController {


    @GetMapping
    public LocalDate getTime(){
        return LocalDate.now();
    }
}
