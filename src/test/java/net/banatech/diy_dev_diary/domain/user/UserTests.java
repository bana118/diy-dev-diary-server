package net.banatech.diy_dev_diary.domain.user;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import net.banatech.diy_dev_diary.repository.user.UserRepository;

@DataJpaTest
public class UserTests {

    @Autowired
    private UserRepository userRepository;

    @BeforeEach
    void setup() {
        userRepository.deleteAll();
    }

    @Test
    void testCreateUser() {
        var newUser = new User("testName", "test@example.com");
        var savedUser = userRepository.saveAndFlush(newUser);

        assertThat(newUser).isEqualTo(savedUser);
        assertThat(savedUser.getCreatedAt()).isNotNull();
        assertThat(savedUser.getUpdatedAt()).isNotNull();

        assertThat(userRepository.count()).isEqualTo(1);

        // この書き方だとuptetedUserのcreatedAtがnullになってしまう(原因不明)
        // var modifiedUser = new User("modifiedName", "modified@example.com");
        // modifiedUser.setId(savedUser.getId());
        // var updatedUser = userRepository.saveAndFlush(modifiedUser);

        savedUser.setName("modifiedName");
        savedUser.setemail("modified@example.com");
        var updatedUser = userRepository.saveAndFlush(savedUser);

        assertThat(updatedUser.getCreatedAt()).isNotNull();
        assertThat(updatedUser.getUpdatedAt()).isNotNull();
        assertThat(updatedUser.getUpdatedAt()).isAfter(updatedUser.getCreatedAt());

        assertThat(userRepository.count()).isEqualTo(1);
    }

    @Test
    void testFindAllUser() {
        userRepository.save(new User("testName1", "test1@example.com"));
        userRepository.save(new User("testName2", "test2@example.com"));
        userRepository.save(new User("testName3", "test3@example.com"));

        var allUser = userRepository.findAll();
        assertThat(allUser).size().isEqualTo(3);

        var expectedAllUser = Arrays.asList(new User("testName1", "test1@example.com"),
                new User("testName2", "test2@example.com"), new User("testName3", "test3@example.com"));

        assertThat(allUser.get(0).getName()).isEqualTo(expectedAllUser.get(0).getName());
        assertThat(allUser.get(0).getemail()).isEqualTo(expectedAllUser.get(0).getemail());
        assertThat(allUser.get(1).getName()).isEqualTo(expectedAllUser.get(1).getName());
        assertThat(allUser.get(1).getemail()).isEqualTo(expectedAllUser.get(1).getemail());
        assertThat(allUser.get(2).getName()).isEqualTo(expectedAllUser.get(2).getName());
        assertThat(allUser.get(2).getemail()).isEqualTo(expectedAllUser.get(2).getemail());
    }

    @Test
    void testDeleteUser() {
        var savedUser = userRepository.save(new User("testName", "test@example.com"));
        userRepository.deleteById(savedUser.getId());
        assertThat(userRepository.count()).isEqualTo(0);
    }

}
