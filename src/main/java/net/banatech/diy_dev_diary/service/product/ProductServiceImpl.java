package net.banatech.diy_dev_diary.service.product;

import org.springframework.transaction.annotation.Transactional;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import net.banatech.diy_dev_diary.domain.Product;
import net.banatech.diy_dev_diary.repository.product.ProductRepository;

public class ProductServiceImpl implements ProductService {
    // private static final Logger logger =
    // LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findOne(String productId) {
        return this.productRepository.findOne(productId);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void insert(Product product) {
        this.productRepository.insert(product);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void update(Product product) {
        this.productRepository.update(product);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void delete(Product product) {
        this.productRepository.delete(product);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void deleteAll() {
        this.productRepository.deleteAll();
    }

}
