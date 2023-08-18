package com.stefandreich.ecommerce.dto;

import com.stefandreich.ecommerce.entity.Address;
import com.stefandreich.ecommerce.entity.Customer;
import com.stefandreich.ecommerce.entity.Order;
import com.stefandreich.ecommerce.entity.OrderItem;
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
