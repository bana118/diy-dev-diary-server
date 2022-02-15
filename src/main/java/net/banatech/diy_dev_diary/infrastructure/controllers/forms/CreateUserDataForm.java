package net.banatech.diy_dev_diary.infrastructure.controllers.forms;

import lombok.Data;
import net.banatech.diy_dev_diary.domain.User;

@Data
public class CreateUserDataForm {
    private String name;
    private String mailAddress;

    public User toUser() {
        return new User(name, mailAddress);
    }
}
