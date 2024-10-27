package com.ejemplo.tarea.repository;

import com.ejemplo.tarea.model.Tarea;
import org.springframework.data.repository.CrudRepository;

public interface TareaRepository extends CrudRepository<Tarea, Long> {
}

