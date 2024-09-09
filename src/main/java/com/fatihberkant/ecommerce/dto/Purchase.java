package com.fatihberkant.ecommerce.dto;


import com.fatihberkant.ecommerce.entity.Address;
import com.fatihberkant.ecommerce.entity.Customer;
import com.fatihberkant.ecommerce.entity.Order;
import com.fatihberkant.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
