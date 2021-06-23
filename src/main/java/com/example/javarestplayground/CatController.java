package com.example.javarestplayground;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    @RequestMapping("/cats")
    public @ResponseBody String catsList() {
        return "Meow!";
    }
}
