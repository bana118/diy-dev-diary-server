package net.banatech.diy_dev_diary.use_cases;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.banatech.diy_dev_diary.domain.user.User;
import net.banatech.diy_dev_diary.domain.user.UserRepository;

@Service
@AllArgsConstructor
public class GetAllUserData {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
