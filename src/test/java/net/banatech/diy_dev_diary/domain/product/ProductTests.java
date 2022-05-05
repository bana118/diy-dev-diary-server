package net.banatech.diy_dev_diary.domain.product;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import net.banatech.diy_dev_diary.repository.product.ProductRepository;

@DataJpaTest
public class ProductTests {

    @Autowired
    private ProductRepository productRepository;

    @BeforeEach
    void setup() {
        productRepository.deleteAll();
    }

    @Test
    void testCreateProduct() throws InterruptedException {
        var newProduct = new Product("testName", "testDescription", "testUrl");
        var savedProduct = productRepository.save(newProduct);

        assertThat(newProduct).isEqualTo(savedProduct);
        assertThat(savedProduct.getCreatedAt()).isNotNull();
        assertThat(savedProduct.getUpdatedAt()).isNotNull();
    }

}
