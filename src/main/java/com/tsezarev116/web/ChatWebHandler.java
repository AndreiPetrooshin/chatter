package com.tsezarev116.web;

import com.tsezarev116.model.ChatGroup;
import org.springframework.web.bind.annotation.RestController;

@RestController("/chat")
public interface ChatWebHandler {

    //mapping - /create/public/group;

    /**
     * Метод создает публичную группу,
     * в которую может вступить любой желающий
     */
    void addPublicGroup(ChatGroup chatGroup);

    //mapping - /create/private/group;

    /**
     * Метод создает приватную группу,
     * в которую могут только приглашать
     */
    void addPrivateGroup(ChatGroup chatGroup);

    //mapping - /remove/group;

    /*Продумать логику подтверждения и удаления*/

    /**
     * Метод, удаляющий группу, идентификатор которой идет параметром.
     * Группу может удалять только Главный админ ресурса или данной группы.
     */
    void removeGroup(int chatGroupId);

    //mapping - /change/group/name
    /**
     * Данный метод просто меняет имя группы*/
    void changeGroupName(String name);
}
