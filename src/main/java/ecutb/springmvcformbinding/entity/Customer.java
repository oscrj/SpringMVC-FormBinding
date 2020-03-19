package ecutb.springmvcformbinding.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;

public class Customer {

    private String customerId;
    private String email;
    private LocalDate regDate;
    private boolean active;
    private CustomerDetails customerDetails;

    public Customer(String email, CustomerDetails customerDetails) {
        this.customerId = UUID.randomUUID().toString();
        this.email = email;
        this.active = true;
        this.regDate = LocalDate.now();
        this.customerDetails = customerDetails;
    }

    public Customer() {}

    public String getCustomerId() {
        return customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegDate() {
        return regDate.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(regDate, customer.regDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, email, regDate);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", email='" + email + '\'' +
                ", regDate=" + regDate +
                ", customerDetails=" + customerDetails +
                '}';
    }
}
