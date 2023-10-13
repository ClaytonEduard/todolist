package br.com.claytoneduard.todolist.task;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface ITaskRepository extends JpaRepository<TaskModel, UUID>{

    // metodo find personalizado
    List<TaskModel> findByIdUser(UUID idUser);
    
}