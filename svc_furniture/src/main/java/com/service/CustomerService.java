/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.domain.Customer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Erick Pereyra
 */
@Service
public class CustomerService {
    List<Customer> customers = new ArrayList<>();
    
    public void addCustomer (Customer customer) {
        customers.add(customer);
    }
    
    public List<Customer> getCustomers() {
        return customers;
    }
}
