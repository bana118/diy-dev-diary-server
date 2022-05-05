package net.banatech.diy_dev_diary.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.banatech.diy_dev_diary.domain.product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
