package net.banatech.diy_dev_diary.repository.user;

import net.banatech.diy_dev_diary.domain.User;

public interface UserRepository {
    User findOne(String userId);

    void insert(User user);

    void update(User user);

    void delete(User user);

    void deleteAll();
}