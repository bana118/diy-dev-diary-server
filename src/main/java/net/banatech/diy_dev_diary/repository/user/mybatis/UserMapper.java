package net.banatech.diy_dev_diary.repository.user.mybatis;

import org.apache.ibatis.annotations.Param;

import net.banatech.diy_dev_diary.domain.user.User;

public interface UserMapper {
    User get(@Param("id") String id);

    int add(User user);

    int set(User user);

    int remove(User user);
}
