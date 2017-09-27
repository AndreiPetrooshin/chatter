package com.tsezarev116.web;

import com.tsezarev116.model.Message;
import org.springframework.web.bind.annotation.RestController;

@RestController("/message")
public interface RestActionsWithMessages {

    //mapping - /send; method-post
    void sendTo(Message message);

    //mapping - /history/get/user/{id}; method-get
    Object getHistoryWithUser(int userId);

    //mapping - /history/get/group/{id}; method-get
    Object getHistoryWithGroup(int groupId);

}
