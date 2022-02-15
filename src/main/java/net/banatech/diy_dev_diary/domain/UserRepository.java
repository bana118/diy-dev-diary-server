package net.banatech.diy_dev_diary.domain;

import java.util.List;

public interface UserRepository {
    User save(User user);

    List<User> findAll();
}
