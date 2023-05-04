package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Model.Address;
@Repository
public interface AddressRepo extends JpaRepository<Address,Integer>
{

}