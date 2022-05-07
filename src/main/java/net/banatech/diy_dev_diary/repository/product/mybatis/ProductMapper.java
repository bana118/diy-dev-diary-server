package net.banatech.diy_dev_diary.repository.product.mybatis;

import org.apache.ibatis.annotations.Param;

import net.banatech.diy_dev_diary.domain.Product;

public interface ProductMapper {
    Product get(@Param("id") String id);

    int add(Product product);

    int set(Product product);

    int remove(Product product);

    int removeAll();
}
