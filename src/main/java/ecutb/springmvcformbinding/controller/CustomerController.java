package ecutb.springmvcformbinding.controller;

import ecutb.springmvcformbinding.data.CustomerDao;
import ecutb.springmvcformbinding.dto.CustomerFormDto;
import ecutb.springmvcformbinding.entity.Customer;
import ecutb.springmvcformbinding.entity.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
public class CustomerController {

    private CustomerDao customerDao;

    @Autowired
    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GetMapping("customers")
    public String findAll(Model model){
        model.addAttribute("customers", customerDao.findAll());
        return "customers";
    }

    @GetMapping("customer/create")
    public String getForm(Model model){
        CustomerFormDto customerFormDto = new CustomerFormDto();
        model.addAttribute("customer", customerFormDto);
        return "create-customer";
    }

    @PostMapping("customer/process")
    public String create(@Valid @ModelAttribute("form") CustomerFormDto customerFormDto, BindingResult bindingResult){

        


        Customer newCustomer = new Customer(customerFormDto.getEmail(), new CustomerDetails(
                customerFormDto.getAddress(),
                customerFormDto.getCity(),
                customerFormDto.getZipCode(),
                customerFormDto.getHomePhone(),
                customerFormDto.getCellPhone()));
        newCustomer = customerDao.save(newCustomer);
        return "redirect:/customers";
    }

    @GetMapping("customer/details")
    public String find(@RequestParam("id") String customerId, Model model){
        Customer customer = customerDao.findById(customerId).get();
        model.addAttribute("customer", customer);
        return "customer-details";
    }

}
