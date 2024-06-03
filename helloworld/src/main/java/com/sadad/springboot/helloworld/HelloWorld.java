package com.sadad.springboot.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorld {

    //@RequestMapping(path = "/hello",method = RequestMethod.GET)
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World1";
    }


    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

//http://localhost:9090/hello-world-bean-path-variable/morteza
 @GetMapping("/hello-world-bean-path-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World %s ",name));
    }

//http://localhost:9090/hello-world-bean-request-param?firstName=morteza&lastName=aghasi
@GetMapping("/hello-world-bean-request-param")
    public HelloWorldBean helloWorldBean(@RequestParam String firstName,@RequestParam String lastName){
        return new HelloWorldBean(String.format("Hello World %s %s",firstName,lastName));
    }



}
