package br.com.claytoneduard.todolist.user;

import org.springframework.beans.factory.annotation.Autowired;
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
    public UserModel create(@RequestBody UserModel userModel) {
        // verificar se o usuario ja exite
       var user = this.userRepository.findByUsername(userModel.getUsername());
        if(user !=null){
            System.out.println("Usuario já exite");
            return null;
        }
      var userCreated = this.userRepository.save(userModel);
      return userCreated;
    }

}
