package net.banatech.diy_dev_diary.use_cases.user;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.banatech.diy_dev_diary.domain.user.User;
import net.banatech.diy_dev_diary.domain.user.UserRepository;

@Service
@AllArgsConstructor
public class CreateUser {
    private final UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }
}
