package com.huunghia.bliss.api;

import com.huunghia.bliss.dto.request.UserCreationRequest;
import com.huunghia.bliss.dto.request.UserUpdationRequest;
import com.huunghia.bliss.entity.User;
import com.huunghia.bliss.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerApi {

    @Autowired
    UserService userService;

    @PostMapping
    User createUser(@RequestBody @Valid UserCreationRequest request){
        return userService.createRequest(request);
    }

    @PutMapping("/{userid}")
    User updateUser(@PathVariable Long userid, @RequestBody UserUpdationRequest request){
        return userService.updateRequest(request, userid);
    }

    @DeleteMapping("/{userid}")
    String deleteUser(@PathVariable Long userid){
        userService.deleteRequest(userid);
        return "User has been deleted";
    }

    @GetMapping
    List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/{userid}")
    User getUser(@PathVariable Long userid){
        return userService.getUser(userid);
    }
}
