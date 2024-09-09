package com.fatihberkant.ecommerce.service;

import com.fatihberkant.ecommerce.dto.PaymentInfo;
import com.fatihberkant.ecommerce.dto.Purchase;
import com.fatihberkant.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
