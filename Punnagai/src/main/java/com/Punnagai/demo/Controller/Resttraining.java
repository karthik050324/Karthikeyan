package com.Punnagai.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Punnagai.demo.dao.StudentRepositery;

@RestController
public class Resttraining {
  @Autowired
  public StudentRepositery repobj;
  
  public Resttraining saveInfo(@RequestBody Resttraining obj) {
	  return repobj.save(obj);
	  
  }
  public List<Resttraining> getAllResttraining()
  {
	  List<Resttraining>restList=repobj.findAll();
	  return restList;
  }
}
