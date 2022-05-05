package net.banatech.diy_dev_diary.domain.user;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private String id;

    private String name;

    private String email;

    private Date createdAt;

    private Date updatedAt;
}
