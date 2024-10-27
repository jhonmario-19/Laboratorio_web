package com.ejemplo.tarea.controller;

import com.ejemplo.tarea.model.Tarea;
import com.ejemplo.tarea.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaRepository tareaRepository;

    // Obtener todas las tareas
    @GetMapping
    public Iterable<Tarea> obtenerTareas() {
        return tareaRepository.findAll();
    }

    // Obtener una tarea por ID
    @GetMapping("/{id}")
    public Optional<Tarea> obtenerTareaPorId(@PathVariable Long id) {
        return tareaRepository.findById(id);
    }

    // Crear una nueva tarea
    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    // Actualizar una tarea existente
    @PutMapping("/{id}")
    public Tarea actualizarTarea(@PathVariable Long id, @RequestBody Tarea tareaActualizada) {
        tareaActualizada.setId(id);
        return tareaRepository.save(tareaActualizada);
    }

    // Eliminar una tarea
    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareaRepository.deleteById(id);
    }
}

