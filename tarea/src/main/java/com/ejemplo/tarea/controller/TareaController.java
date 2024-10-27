package com.ejemplo.tarea.controller;

import com.ejemplo.tarea.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TareaController {
    
    private final TareaService tareaService;

    @Autowired
    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/mensaje")
    public String mostrarMensaje() {
        return tareaService.obtenerMensaje();
    }
}
