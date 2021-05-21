package com.example.javarestplayground;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatController {

    @RequestMapping("/")
    public @ResponseBody String catsList() {
        return "Meow!";
    }
}
