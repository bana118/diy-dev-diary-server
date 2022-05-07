package net.banatech.diy_dev_diary.domain.product;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.banatech.diy_dev_diary.DiyDevDiaryApplication;
import net.banatech.diy_dev_diary.repository.product.ProductRepository;

@SpringBootTest(classes = DiyDevDiaryApplication.class)
public class ProductTests {

    @Autowired
    private ProductRepository productRepository;

    @BeforeEach
    void setup() {
        productRepository.deleteAll();
    }

    @Test
    void testInsert() throws Exception {
        Date now = new Date();
        Product product = new Product("01", "testName", "testDescription", "https://example.com/test", now, now);
        productRepository.insert(product);
    }
}
