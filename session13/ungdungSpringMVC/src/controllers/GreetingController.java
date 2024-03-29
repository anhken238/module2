package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("/index")
    public String greeting(@RequestParam String name, Model modle){
        modle.addAttribute("name",name);
        return "home/index";
    }
    @GetMapping("/about")
    public String greetingAbout(){
        return "home/about";
    }
    @GetMapping("/contact")
    public String greetingContact(){
        return "home/contact";
    }
}


