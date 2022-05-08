package net.banatech.diy_dev_diary.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.banatech.diy_dev_diary.domain.User;
import net.banatech.diy_dev_diary.service.user.UserService;

@RestController
@RequestMapping("api/user")
public class UserRestController {
    // private static final Logger logger =
    // LoggerFactory.getLogger(ProductServiceImpl.class);

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/{userId}", produces = "application/json")
    public User get(@PathVariable String userId) {
        return this.userService.findOne(userId);
    }

    @PostMapping(path = "")
    public void add(@RequestBody User user) {
        this.userService.insert(user);
    }

    @PatchMapping(path = "/{userId}", produces = "application/json")
    public void set(@PathVariable String userId, @RequestBody User user) {
        user.setId(userId);
        this.userService.update(user);
    }

    @DeleteMapping(path = "/{userId}", produces = "application/json")
    public void remove(@PathVariable String userId) {
        this.userService.delete(userId);
    }

}
