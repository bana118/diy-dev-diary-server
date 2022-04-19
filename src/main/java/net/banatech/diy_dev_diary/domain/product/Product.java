package net.banatech.diy_dev_diary.domain.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.banatech.diy_dev_diary.domain.BaseEntity;

@Entity
@Table(name = "products")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Product extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "url")
    private String url;

    public Product(String name, String description, String url) {
        this.name = name;
        this.description = description;
        this.url = url;
    }
}
