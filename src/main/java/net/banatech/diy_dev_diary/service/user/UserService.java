package net.banatech.diy_dev_diary.service.user;

import org.springframework.stereotype.Service;

import net.banatech.diy_dev_diary.domain.User;

@Service
public interface UserService {
    User findOne(String userId);

    void insert(User user);

    void update(User user);

    void delete(User user);

    void deleteAll();
}
