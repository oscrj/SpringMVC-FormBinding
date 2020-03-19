package ecutb.springmvcformbinding.data;

import ecutb.springmvcformbinding.entity.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    Optional<Customer> findById(String customerId);
    Optional<Customer> findByEmail(String email);
    Customer save(Customer customer);
    boolean delete(String customerId);
    List<Customer> findAll();
}
