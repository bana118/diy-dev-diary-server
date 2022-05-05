package net.banatech.diy_dev_diary.use_cases.user;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.banatech.diy_dev_diary.domain.user.User;
import net.banatech.diy_dev_diary.repository.user.UserRepository;

@Service
@AllArgsConstructor
public class GetAllUsers {
    private final UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
