package net.banatech.diy_dev_diary.repository.product;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import net.banatech.diy_dev_diary.domain.product.Product;
import net.banatech.diy_dev_diary.repository.ResourceNotFoundException;
import net.banatech.diy_dev_diary.repository.product.mybatis.ProductMapper;;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private static final Logger logger = LoggerFactory.getLogger(ProductRepositoryImpl.class);

    private final SqlSessionTemplate sqlSessionTemplate;

    public ProductRepositoryImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public Product findOne(String productId) {
        Product product = this.sqlSessionTemplate.getMapper(ProductMapper.class).get(productId);

        if (product == null) {
            logger.info("Product not found. id={}", productId);
            throw new ResourceNotFoundException("Product not found");
        }

        return product;
    }

    @Override
    public void insert(Product product) {
        this.sqlSessionTemplate.getMapper(ProductMapper.class).add(product);
    }

    @Override
    public void update(Product product) {
        int affected = this.sqlSessionTemplate.getMapper(ProductMapper.class).set(product);
        if (affected != 1) {
            logger.info("Product not found. id={}", product.getId());
            throw new ResourceNotFoundException("Product not found");
        }
    }

    @Override
    public void delete(Product product) {
        int affected = this.sqlSessionTemplate.getMapper(ProductMapper.class).remove(product);
        if (affected != 1) {
            logger.info("Product not found. id={}", product.getId());
            throw new ResourceNotFoundException("Product not found");
        }
    }

    @Override
    public void deleteAll() {
        this.sqlSessionTemplate.getMapper(ProductMapper.class).removeAll();
    }
}
