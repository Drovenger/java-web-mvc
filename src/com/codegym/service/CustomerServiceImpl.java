package com.codegym.service;

import com.codegym.model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {

    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer(1, "Vinh", "vinh@codegym.com", "Ha Noi"));
        customers.put(2, new Customer(2, "Minh", "minh@codegym.com", "Thai Binh"));
        customers.put(3, new Customer(3, "Linh", "linh@codegym.com", "Sai Gon"));
        customers.put(4, new Customer(4, "Ninh", "ninh@codegym.com", "Nam Dinh"));
        customers.put(5, new Customer(5, "Thinh", "thinh@codegym.com", "Quang Ninh"));
        customers.put(6, new Customer(6, "Quynh", "quynh@codegym.com", "Da Nang"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customers.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customers.put(id, customer);
    }

    @Override
    public void remove(int id) {
        customers.remove(id);
    }
}
