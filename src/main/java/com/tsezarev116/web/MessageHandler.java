package com.tsezarev116.web;

import com.tsezarev116.model.Message;
import org.springframework.web.bind.annotation.RestController;

@RestController("/message")
public interface MessageHandler {

    //mapping - /send; method-post

    /**
     * Отправляет приватное сообщение пользователю
     */
    void sendTo(Message message);

    //mapping - /history/get/user/{id}; method-get

    /**
     * Возвращает историю сообщений с пользователем
     */
    Object getHistoryWithUser(int userId);

    //mapping - /history/get/group/{id}; method-get

    /**
     * Возвращает историю сообщений в группе
     */
    Object getHistoryWithGroup(int groupId);

}
