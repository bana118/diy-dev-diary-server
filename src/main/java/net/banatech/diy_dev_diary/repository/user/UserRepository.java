package net.banatech.diy_dev_diary.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.banatech.diy_dev_diary.domain.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
