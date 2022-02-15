package net.banatech.diy_dev_diary.use_cases;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.banatech.diy_dev_diary.domain.User;
import net.banatech.diy_dev_diary.domain.UserRepository;

@Service
@AllArgsConstructor
public class CreateUserData {
    private final UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }
}
