package vn.com.databoy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("message", "hello");
        return "index";
    }
}