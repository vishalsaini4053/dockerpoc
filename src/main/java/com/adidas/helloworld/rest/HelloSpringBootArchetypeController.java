package com.adidas.helloworld.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloSpringBootArchetypeController {

@Value("${MESSAGE}")
private String message;	

    @RequestMapping(value = "/helloSpringBootArchetype", method = RequestMethod.GET)
    public ResponseEntity<String> helloArchetype(){
        return new ResponseEntity<>("Welcome to the SpringBoot archetype controller.", HttpStatus.OK);
    }
    
    @RequestMapping(value = "/helloworld", method = RequestMethod.GET)
    public ResponseEntity<String> helloworld(){
        return new ResponseEntity<>("Message from property:  "+ message, HttpStatus.OK);
    }
}
