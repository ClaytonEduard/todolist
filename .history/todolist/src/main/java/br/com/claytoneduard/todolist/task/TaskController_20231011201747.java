package br.com.claytoneduard.todolist.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController{

    @Autowired
    private ITaskRepository taskRepository;


    public void create(@RequestBody TaskModel taskModel){
        this.taskRepository.save(taskModel);
    }
    
}
