package com.example.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.Model.Person;
@Repository
public interface PersonRepo extends JpaRepository<Person,Long>
{

}