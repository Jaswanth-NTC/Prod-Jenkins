package com.abhishek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class StartApplication {
    public static void printCICDMessage() {
    System.out.println("Hello, NTC..we are entering to CI/CD deployment, get ready.");
  }

    @GetMapping("/")
    public String index(final Model model) {
        model.addAttribute("title", "Small Trailer of CI/CD");
        model.addAttribute("msg", "Hello, NTC..we are entering to CI/CD deployment, get ready.");
        return "index";
    }

    public static void main(String[] args) {
        printCICDMessage();
        SpringApplication.run(StartApplication.class, args);
    }

}
