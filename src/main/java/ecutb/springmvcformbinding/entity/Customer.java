package ecutb.springmvcformbinding.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;

public class Customer {

    private String customerId;
    private String email;
    private LocalDate regDate;
    private CustomerDetails customerDetails;

    public Customer(String email, LocalDate regDate, CustomerDetails customerDetails) {
        this.customerId = UUID.randomUUID().toString();
        setEmail(email);
        setRegDate(regDate);
        this.customerDetails = customerDetails;
    }

    public Customer() {
    }

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
        return regDate.format(DateTimeFormatter.ofPattern("dd MM yyyy")).toString();
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = LocalDate.now();
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
