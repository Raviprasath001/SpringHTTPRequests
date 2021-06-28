package com.mayuratech.springcollection.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayuratech.springcollection.model.BankCustomers;

@Repository
public interface BankRepository extends CrudRepository<BankCustomers,Integer> {

}
