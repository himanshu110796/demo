package com.himanshu.controller;

import com.himanshu.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class DemoController {

    @GetMapping("/all-user")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = new ArrayList<User>();
        User user =  new User("Himanshu", "skiphimanshu@gmail.com");
        User user1 =  new User("Chiranjeev", "chiranjv@gmail.com");
        users.add(user);
        users.add(user1);
        return ResponseEntity.ok(users);

    }
}
