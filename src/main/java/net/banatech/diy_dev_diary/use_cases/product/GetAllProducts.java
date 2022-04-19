package net.banatech.diy_dev_diary.use_cases.product;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import net.banatech.diy_dev_diary.domain.product.Product;
import net.banatech.diy_dev_diary.domain.product.ProductRepository;

@Service
@AllArgsConstructor
public class GetAllProducts {
    private final ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }
}
