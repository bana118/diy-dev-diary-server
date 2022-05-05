package net.banatech.diy_dev_diary.use_cases.product;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.banatech.diy_dev_diary.domain.product.Product;
import net.banatech.diy_dev_diary.repository.product.ProductRepository;

@Service
@AllArgsConstructor
public class CreateProduct {
    private final ProductRepository productRepository;

    public Product create(Product product) {
        return productRepository.save(product);
    }
}
