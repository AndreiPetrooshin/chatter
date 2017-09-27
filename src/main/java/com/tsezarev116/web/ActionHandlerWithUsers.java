package com.tsezarev116.web;

import com.tsezarev116.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/user")
public interface ActionHandlerWithUsers {

    //mapping - /get/all; method-get

    /**
     * Метод возвращает всех зарегистрированных
     * пользователей
     */
    List<User> getAll();

    //mapping - /update; method-put)

    /**
     * Метод обновляет данные о пользователе
     */
    void update(User user);

    //mapping - /get/{id}; method-get

    /**
     * Возвращает нужного пользователя по его идентификатору.
     */
    User get(int id);

    //mapping - /remove/{id}; method-delete
    /*нужно вам продумать как будет удаляться пользователь(в плане
        какие то меры защиты, чтобы просто по запросу нельзя было удалить
        пользователя, написав его в браузере)*/

    /**
     * Метод удаляет пользователя по его идентификатору.
     */
    void delete(int id);

    //mapping - /create; method-post

    /**
     * Метод создает пользователя и сохраняет его в бд
     */
    ResponseEntity<User> create(User user);
}
