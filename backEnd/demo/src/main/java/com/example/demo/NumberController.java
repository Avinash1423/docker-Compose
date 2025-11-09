package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin(origins = "http://13.60.37.124")
public class NumberController {


    @GetMapping("avinash-ec2-instance.duckdns.org/api/{input}")
    @ResponseBody
    public int numbers(@PathVariable int input){

       return input*100;

    }
}
