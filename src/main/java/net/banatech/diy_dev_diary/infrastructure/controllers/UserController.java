package net.banatech.diy_dev_diary.infrastructure.controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import net.banatech.diy_dev_diary.domain.user.User;
import net.banatech.diy_dev_diary.infrastructure.controllers.forms.CreateUserDataForm;
import net.banatech.diy_dev_diary.use_cases.CreateUserData;
import net.banatech.diy_dev_diary.use_cases.GetAllUserData;

@RestController
@AllArgsConstructor
public class UserController {
    private final CreateUserData createUserData;
    private final GetAllUserData getAllUserData;

    @GetMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAllUserData() {
        return getAllUserData.getAll();
    }

    @PostMapping(value = "/api/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public User createUserData(@RequestBody CreateUserDataForm createUserDataForm) {
        return createUserData.create(createUserDataForm.toUser());
    }
}
