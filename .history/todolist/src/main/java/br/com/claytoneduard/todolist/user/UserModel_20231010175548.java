package br.com.claytoneduard.todolist.user;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    private String username;
    private String name;
    private String password;

}
