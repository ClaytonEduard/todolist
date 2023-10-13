package br.com.claytoneduard.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @Autowired
    private ITaskRepository taskRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody TaskModel taskModel, HttpServletRequest request) {
        // passando o iduser para a taskModel
        var idUser = request.getAttribute("idUser");
        taskModel.setIdUser((UUID) idUser);

        // validando ao data a atual
        var currentDate = LocalDateTime.now();
        // se a data atual for maior que a de inicio
        if (currentDate.isAfter(taskModel.getStartAt()) || currentDate.isAfter(taskModel.getEndAt())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A data de incio / data de termino deve ser maior que
            a data atual:")
        }

 if (currentDate.isAfter(taskModel.getStartAt()) ) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("A data de incio / data de termino deve ser maior que
            a data atual:")
        }


        var task = this.taskRepository.save(taskModel);
        return ResponseEntity.status(HttpStatus.OK).body(task);
    }

}
