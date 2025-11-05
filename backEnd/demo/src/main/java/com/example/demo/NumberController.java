package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@CrossOrigin(origins = "http://localhost:5173")
public class NumberController {


    @GetMapping("backEnd/api/{input}")
    @ResponseBody
    public int numbers(@PathVariable int input){

       return input*100;

    }
}
