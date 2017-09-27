package com.tsezarev116.web;

import com.tsezarev116.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user")
public interface ActionWithUsers {

    //mapping - /get/all; method-get
    List<User> getAll();

    //mapping - /update; method-put)
    void update( User user);

    //mapping - /get/{id}; method-get
    User get(int id);

    //mapping - /remove/{id}; method-delete
    void delete(int id);

    //mapping - /create; method-post
    ResponseEntity<User> create(User user);
}
