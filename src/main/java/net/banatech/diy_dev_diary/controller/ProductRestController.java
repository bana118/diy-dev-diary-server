package net.banatech.diy_dev_diary.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.banatech.diy_dev_diary.domain.Product;
import net.banatech.diy_dev_diary.service.product.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductRestController {
    // private static final Logger logger =
    // LoggerFactory.getLogger(ProductServiceImpl.class);

    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/{productId}", produces = "application/json")
    public Product get(@PathVariable String productId) {
        return this.productService.findOne(productId);
    }

    @PostMapping(path = "")
    public void add(@RequestBody Product product) {
        this.productService.insert(product);
    }

    @PatchMapping(path = "/{productId}", produces = "application/json")
    public void set(@PathVariable String productId, @RequestBody Product product) {
        product.setId(productId);
        this.productService.update(product);
    }

    @DeleteMapping(path = "/{productId}", produces = "application/json")
    public void remove(@PathVariable String productId) {
        this.productService.delete(productId);
    }

}
