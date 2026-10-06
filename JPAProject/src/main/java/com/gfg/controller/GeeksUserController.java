package com.gfg.controller;

import com.gfg.model.GeeksUserRecord;
import com.gfg.service.GeeksUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")               // base path
public class GeeksUserController {

    private final GeeksUserService userService;

    public GeeksUserController(GeeksUserService userService) {
        this.userService = userService;
    }

    // GET /api/users
    @GetMapping("/users")
    public List<GeeksUserRecord> getAllUser() {
        return userService.getAllGeeksUsers();
    }

    // POST /api/users
    @PostMapping("/users")
    public ResponseEntity<GeeksUserRecord> addUser(@RequestBody GeeksUserRecord userRecord) {
        GeeksUserRecord saved = userService.addGeeksUser(userRecord);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }
}
