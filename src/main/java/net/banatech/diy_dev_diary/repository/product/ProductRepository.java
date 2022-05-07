package net.banatech.diy_dev_diary.repository.product;

import net.banatech.diy_dev_diary.domain.Product;

public interface ProductRepository {
    Product findOne(String productId);

    void insert(Product product);

    void update(Product product);

    void delete(Product product);

    void deleteAll();
}
