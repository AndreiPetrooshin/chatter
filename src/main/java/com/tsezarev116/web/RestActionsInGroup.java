package com.tsezarev116.web;

import com.tsezarev116.model.Role;
import org.springframework.web.bind.annotation.RestController;

/*тут в реализации маппинги придумаете сами*/
@RestController("/group")
public interface RestActionsInGroup {

    void addUser(int groupId, int userId);

    void deleteUser(int groupId, int userId);

    void userBan(int groupId, int userId);

    void addRole(Role role, int userId);

    void removeRole(Role role, int userId);
}
