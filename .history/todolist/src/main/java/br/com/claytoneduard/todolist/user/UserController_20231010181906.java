package br.com.claytoneduard.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserRepository userRepository;

    @PostMapping("/")
    public ResponseEntity create(@RequestBody UserModel userModel) {
        // verificar se o usuario ja exite
       var user = this.userRepository.findByUsername(userModel.getUsername());
        if(user !=null){
            //mensagem de erro
            // mensagem de status
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário jé existe");
        }
      var userCreated = this.userRepository.save(userModel);
      return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

}
