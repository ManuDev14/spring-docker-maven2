/**
 * Paquete principal de la aplicación demo.
 */
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication { // <-- Quita 'final'

    /**
     * Método principal que inicia la aplicación Spring Boot.
     * @param args argumentos de línea de comandos
     */
    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * Endpoint para verificar el estado de la aplicación.
     * Este método no debe ser sobrescrito.
     * @return "OK" si la aplicación está funcionando correctamente
     */
    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
