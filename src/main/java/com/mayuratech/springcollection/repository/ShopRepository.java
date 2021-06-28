package com.mayuratech.springcollection.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mayuratech.springcollection.model.ShopCustomer;


@Repository
public interface ShopRepository extends CrudRepository<ShopCustomer,Integer>{

}
