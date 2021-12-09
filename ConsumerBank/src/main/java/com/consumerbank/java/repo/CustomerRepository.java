package com.consumerbank.java.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consumerbank.java.entity.Customer;
@Repository
public interface CustomerRepository extends CrudRepository<Customer ,Integer>{

}
