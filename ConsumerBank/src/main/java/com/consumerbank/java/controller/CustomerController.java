package com.consumerbank.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.consumerbank.java.dto.CustomerRequestDTO;
import com.consumerbank.java.dto.CustomerResponseDto;
import com.consumerbank.java.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@PostMapping("/customers")
public String saveCustomerData(@RequestBody CustomerRequestDTO customerRequestDto) {
		 customerService.saveCustomerData(customerRequestDto);
	return "data saved successfully";
}
	@GetMapping("/customers")
	public List<CustomerResponseDto> getCustomerDetails(){
		return customerService.getCustomerDetails();
	}
}