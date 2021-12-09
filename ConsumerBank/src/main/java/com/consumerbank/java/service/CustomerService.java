package com.consumerbank.java.service;

import java.util.List;

import com.consumerbank.java.dto.CustomerRequestDTO;
import com.consumerbank.java.dto.CustomerResponseDto;

public interface CustomerService {

	void saveCustomerData(CustomerRequestDTO customerRequestDto);

	List <CustomerResponseDto> getCustomerDetails();

}
