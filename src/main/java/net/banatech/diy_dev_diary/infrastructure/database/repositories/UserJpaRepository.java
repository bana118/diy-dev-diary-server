package net.banatech.diy_dev_diary.infrastructure.database.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.banatech.diy_dev_diary.domain.User;
import net.banatech.diy_dev_diary.domain.UserRepository;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long>, UserRepository {
}
