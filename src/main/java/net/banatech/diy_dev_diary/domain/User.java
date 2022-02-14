package net.banatech.diy_dev_diary.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private String mailAddress;

    public User(String name, String mailAddress) {
        this.name = name;
        this.mailAddress = mailAddress;
    }
}
