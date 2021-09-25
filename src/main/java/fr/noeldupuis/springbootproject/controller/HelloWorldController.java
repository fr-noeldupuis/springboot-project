package fr.noeldupuis.springbootproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HelloWorldController {

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public Message returnGreetings() {
        return Message.builder().message("Hello World!").build();
    }
}
