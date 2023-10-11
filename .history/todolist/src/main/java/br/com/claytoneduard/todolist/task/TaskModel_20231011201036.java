package br.com.claytoneduard.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

public class TaskModel {

    /**
     * 
     * id
     * usuario (id_usuario)
     * Descricao
     * titulo
     * Data de inicio
     * data de termino
     * prioridade
     * 
     */

    private UUID id;
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private LocalDateTime createdAt;

    private UUID idUser;

}
