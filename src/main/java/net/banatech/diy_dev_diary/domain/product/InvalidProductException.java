package net.banatech.diy_dev_diary.domain.product;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException(String message) {
        super(message);
    }
}
