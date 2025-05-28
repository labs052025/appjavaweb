package com.ejemplo.demo.controladores;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

   
    @GetMapping("/")
    public String inicio() {
        return "index.html"; // Esto devolvería el nombre del archivo HTML
    }
}