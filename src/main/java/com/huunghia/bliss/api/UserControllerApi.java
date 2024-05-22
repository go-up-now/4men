package com.huunghia.bliss.api;

import com.huunghia.bliss.dto.UserDto;
import com.huunghia.bliss.entity.User;
import com.huunghia.bliss.service.impl.UserServicesImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerApi {

    @Autowired
    UserServicesImpl userService;

    @PostMapping
    User createUser(@RequestBody @Valid UserDto request){
        return userService.insertNewUser(request);
    }

    @PutMapping("/{userid}")
    User updateUser(@PathVariable Long userid, @RequestBody UserDto request){
        return userService.updateUser(request, userid);
    }

    @DeleteMapping("/{userid}")
    String deleteUser(@PathVariable Long userid){
        userService.deleteUser(userid);
        return "User has been deleted";
    }

    @GetMapping
    List<User> getUsers(){

        return userService.getAllUser();
    }

    @GetMapping("/{userid}")
    User getUser(@PathVariable Long userid){
        return userService.getUser(userid);
    }
}
