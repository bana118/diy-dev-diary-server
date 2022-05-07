package net.banatech.diy_dev_diary.repository.user;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.banatech.diy_dev_diary.DiyDevDiaryApplication;
import net.banatech.diy_dev_diary.domain.User;

@SpringBootTest(classes = DiyDevDiaryApplication.class)
public class UserTests {

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setup() {
        userRepository.deleteAll();
    }

    @Test
    void testInsert() throws Exception {
        Date now = new Date();
        User user = new User("01", "testName", "test@example.com", now, now);
        userRepository.insert(user);
    }
}
