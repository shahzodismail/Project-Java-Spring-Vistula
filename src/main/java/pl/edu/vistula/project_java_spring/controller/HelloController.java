package pl.edu.vistula.project_java_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    // Task 1: Plain text (The @ResponseBody makes this work with @Controller)
    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello Vistula, in my first Spring controller.";
    }

    // Task 2: HTML Template (Looks for greeting.html in the templates folder)
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}