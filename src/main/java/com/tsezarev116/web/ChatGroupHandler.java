package com.tsezarev116.web;

import com.tsezarev116.model.Role;
import org.springframework.web.bind.annotation.RestController;

/*тут в реализации маппинги придумаете сами*/
@RestController("/group")
public interface ChatGroupHandler {

    void addUser(int groupId, int userId);

    void deleteUser(int groupId, int userId);

    /**
     * Дать бан пользователю в группе
     */
    void userBan(int groupId, int userId);

    /**
     * Добавить роль(например модерку) для пользователя в группе
     */
    void addRole(Role role, int userId);

    /**
     * Убрать роль у пользователя
     */
    void removeRole(Role role, int userId);
}
