package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin(origins = "https://avinash-ec2-instance.duckdns.org")//doesnt make a differenc ehandles by nginx 
public class NumberController {


    @GetMapping("/{input}")
    @ResponseBody
    public int numbers(@PathVariable int input){

       return input*100;


    }
}
