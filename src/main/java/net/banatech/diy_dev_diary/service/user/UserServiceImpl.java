package net.banatech.diy_dev_diary.service.user;

import org.springframework.transaction.annotation.Transactional;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import net.banatech.diy_dev_diary.domain.User;
import net.banatech.diy_dev_diary.repository.user.UserRepository;

public class UserServiceImpl implements UserService {
    // private static final Logger logger =
    // LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findOne(String userId) {
        return this.userRepository.findOne(userId);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void insert(User user) {
        this.userRepository.insert(user);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void update(User user) {
        this.userRepository.update(user);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void delete(String userId) {
        User user = this.userRepository.lock(userId);
        this.userRepository.delete(user);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void deleteAll() {
        this.userRepository.deleteAll();
    }

}
