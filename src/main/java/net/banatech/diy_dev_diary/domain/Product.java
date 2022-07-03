package net.banatech.diy_dev_diary.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    private String id;

    private String name;

    private String description;

    private String url;

    private Date createdAt;

    private Date updatedAt;
}
