package org.project.ComplementModule.contorollers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/module")
    public String testController(){

        return "Message from Complement Module";

    }

}
