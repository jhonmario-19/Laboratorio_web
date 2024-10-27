package com.ejemplo.tarea;

import com.ejemplo.tarea.model.Tarea;
import com.ejemplo.tarea.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareaApplication implements CommandLineRunner {

    @Autowired
    private TareaRepository tareaRepository;

    public static void main(String[] args) {
        SpringApplication.run(TareaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Datos de ejemplo
        tareaRepository.save(new Tarea("Aprender Spring Boot", "Estudiar el framework y sus características"));
        tareaRepository.save(new Tarea("Desarrollar API", "Implementar una API RESTful con Spring Boot"));
    }
}
