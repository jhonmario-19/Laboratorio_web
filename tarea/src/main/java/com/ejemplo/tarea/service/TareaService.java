package com.ejemplo.tarea.service;

import org.springframework.stereotype.Service;

@Service
public class TareaService {
    public String obtenerMensaje() {
        return "Hola desde el servicio de tareas!";
    }
}
