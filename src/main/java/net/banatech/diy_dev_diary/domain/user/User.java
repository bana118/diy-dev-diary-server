package net.banatech.diy_dev_diary.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.banatech.diy_dev_diary.domain.BaseEntity;

@Entity
@Table(name = "users")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class User extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "mail_address")
    private String mailAddress;

    public User(String name, String mailAddress) {
        this.name = name;
        this.mailAddress = mailAddress;
    }
}