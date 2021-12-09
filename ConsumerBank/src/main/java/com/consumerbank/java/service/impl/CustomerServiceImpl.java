package com.consumerbank.java.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consumerbank.java.dto.CustomerRequestDTO;
import com.consumerbank.java.dto.CustomerResponseDto;
import com.consumerbank.java.entity.Customer;
import com.consumerbank.java.repo.CustomerRepository;
import com.consumerbank.java.service.CustomerService;
@Service
public class CustomerServiceImpl  implements CustomerService{
 @Autowired
	CustomerRepository customerRepository;
	@Override
	public void saveCustomerData(CustomerRequestDTO customerRequestDto) {
		Customer customer=new Customer();
		BeanUtils.copyProperties(customerRequestDto, customer);
		customerRepository.save(customer);
		
	}
	@Override
	public List <CustomerResponseDto> getCustomerDetails() {
		List<CustomerResponseDto> customerResponseList=new ArrayList<>();
	Iterator it=customerRepository.findAll().iterator();
		while (it.hasNext()) {
			CustomerResponseDto responseDto=new CustomerResponseDto();
			BeanUtils.copyProperties(it, responseDto);
			 customerResponseList.add(responseDto);
	}
		return  customerResponseList;
	}
}
