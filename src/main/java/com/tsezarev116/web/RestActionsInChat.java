package com.tsezarev116.web;

import com.tsezarev116.model.ChatGroup;
import org.springframework.web.bind.annotation.RestController;

@RestController("/chat")
public interface RestActionsInChat {

    //mapping - /create/group;
    void addGroup(ChatGroup chatGroup);
    //mapping - /remove/group;
    void removeGroup(int chatGroupId);
    //mapping - /change/group/name
    void changeGroupName(String name);
}
