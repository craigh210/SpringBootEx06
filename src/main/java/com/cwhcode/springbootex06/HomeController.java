package com.cwhcode.springbootex06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/newemployee")
    public String inputPage(Model model) {
        model.addAttribute("employee", new Employee());
        return "newrecord";
    }

    @PostMapping("/newemployee")
    public String outputPage(@ModelAttribute Employee employee, Model model) {
        model.addAttribute("employee", employee);
        return "showrecord";
    }
}
