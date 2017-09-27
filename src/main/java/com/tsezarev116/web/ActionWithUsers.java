package com.tsezarev116.web;

import com.tsezarev116.model.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("/user")
public interface ActionWithUsers {

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    List<User> getAll();

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    void update(@Valid @RequestBody User user);

    @GetMapping(value = "/${id}")
    User get(@PathVariable("id") int id);

    @DeleteMapping(value = "/{id}")
    void delete(@PathVariable("id") int id);

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<User> create(@Valid @RequestBody User user);
}
