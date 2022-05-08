package net.banatech.diy_dev_diary.service.product;

import net.banatech.diy_dev_diary.domain.Product;

public interface ProductService {
    Product findOne(String productId);

    void insert(Product product);

    void update(Product product);

    void delete(String productId);

    void deleteAll();
}
