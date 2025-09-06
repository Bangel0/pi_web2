package com.integrador.sysmarket.Modules.CheckoutProducts.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter @Setter
@Entity
@NoArgsConstructor
public class Order {
    private static final Logger logger = LoggerFactory.getLogger(Order.class);

    private Long orderId;
    private String customer;

    public Order(Long orderId, String customer) {
        this.orderId = orderId;
        this.customer = customer;
        logger.info("An order with id={} was created for customer={}", orderId, customer);
    }

    public void confirmOrder() {
        logger.info("The order with id={} has been confirmed", orderId);
    }

    public void cancelOrder() {
        logger.warn("The order with id={} was canceled by the customer={}", orderId, customer);
    }
}






