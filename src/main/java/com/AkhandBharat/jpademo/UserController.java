package com.AkhandBharat.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
       return userService.addUser(user);
    }

    @GetMapping("get_users")
    public List<User> getUsers(){
       return userService.getUsers();
    }

    @GetMapping("/get_userById")
    public User getUsers(@RequestParam("q") int id){
        return  userService.getAUser(id);
    }

    // H.W.
    // delete by a rollNo
    // delete all the users
    // update a user by id



    @DeleteMapping("/deleteByRollNo")
    public String deleteByRollNo(@RequestParam int id){
      return userService.deleteByRollNo(id);

    }

    @DeleteMapping("/deleteUsers")
    public String deleteUsers(){
       return userService.deleteUsers();

    }

//    @PutMapping("updateById")
//    public String updateUserById(@RequestParam int id){
//       return userService.updateUserById(id);
//
//    }

}
