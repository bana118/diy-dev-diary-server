package net.banatech.diy_dev_diary.repository.user;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import net.banatech.diy_dev_diary.domain.User;
import net.banatech.diy_dev_diary.repository.ResourceNotFoundException;
import net.banatech.diy_dev_diary.repository.user.mybatis.UserMapper;

@Repository
public class UserRepositoryImpl implements UserRepository {
    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryImpl.class);

    private final SqlSessionTemplate sqlSessionTemplate;

    public UserRepositoryImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public User findOne(String userId) {
        User user = this.sqlSessionTemplate.getMapper(UserMapper.class).get(userId);

        if (user == null) {
            logger.info("User not found. id={}", userId);
            throw new ResourceNotFoundException("User not found");
        }

        return user;
    }

    @Override
    public User lock(String userId) {
        User user = this.sqlSessionTemplate.getMapper(UserMapper.class).lock(userId);

        if (user == null) {
            logger.info("User not found. id={}", userId);
            throw new ResourceNotFoundException("User not found");
        }

        return user;
    }

    @Override
    public void insert(User user) {
        this.sqlSessionTemplate.getMapper(UserMapper.class).add(user);
    }

    @Override
    public void update(User user) {
        int affected = this.sqlSessionTemplate.getMapper(UserMapper.class).set(user);
        if (affected != 1) {
            logger.info("User not found. id={}", user.getId());
            throw new ResourceNotFoundException("User not found");
        }
    }

    @Override
    public void delete(User user) {
        int affected = this.sqlSessionTemplate.getMapper(UserMapper.class).remove(user);
        if (affected != 1) {
            logger.info("User not found. id={}", user.getId());
            throw new ResourceNotFoundException("User not found");
        }
    }

    @Override
    public void deleteAll() {
        this.sqlSessionTemplate.getMapper(UserMapper.class).removeAll();
    }
}
