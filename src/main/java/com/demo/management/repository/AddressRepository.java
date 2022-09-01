package com.demo.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.management.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
