package br.com.claytoneduard.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

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

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;
    private LocalDateTime createdAt;

    private UUID idUser;

}
