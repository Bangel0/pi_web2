package com.integrador.sysmarket.Modules.CheckoutProducts.Payment.Models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Payment {

    private static final Logger logger = LoggerFactory.getLogger(Payment.class);

    private Long paymentId;
    private Double amount;

    public Payment(Long paymentId, Double amount) {
        this.paymentId = paymentId;
        this.amount = amount;
        logger.info("A new payment was created with id={} and amount={}", paymentId, amount);
    }

    public void processPayment() {
        try {
            logger.debug("Processing payment with id={}...", paymentId);

           
            if (amount <= 0) {
                throw new IllegalArgumentException("The amount cannot be zero or negative");
            }

            logger.info(" Payment with id={} processed successfully", paymentId);

        } catch (Exception e) {
            logger.error(" Error while processing payment with id={}: {}", paymentId, e.getMessage());
        }
    }
}
