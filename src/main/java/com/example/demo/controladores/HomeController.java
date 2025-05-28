package com.ejemplo.demo.controladores;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {

    // @GetMapping("/") mapea las solicitudes HTTP GET a la ruta raíz ("/").
    // Cuando un cliente accede a la raíz, Spring Boot buscará automáticamente un archivo
    // llamado "index.html" en la carpeta 'static' (o 'public', 'resources').
    // Por lo tanto, no necesitamos un método que devuelva una cadena para el "Hola Mundo"
    // si queremos que el HTML sea la página principal.
    // Sin embargo, si quisieras una ruta específica para el HTML, podrías hacer:
    @GetMapping("/")
    public String inicio() {
        return "index.html"; // Esto devolvería el nombre del archivo HTML
    }
}