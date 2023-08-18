package com.stefandreich.ecommerce.service;

import com.stefandreich.ecommerce.dto.PaymentInfo;
import com.stefandreich.ecommerce.dto.Purchase;
import com.stefandreich.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
