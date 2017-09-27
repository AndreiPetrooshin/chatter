package com.tsezarev116.model;

import java.util.List;

public class ChatGroup {
    //Участники данного канала. P.S. - в одной группе может быть много участников(юзеров),
    //у одного юзера может быть множество групп(каналов)
    private List<User> usersInChannel;
}
