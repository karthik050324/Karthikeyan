package com.review2.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.review2.project.model.AdminModel;
import com.review2.project.model.LoanApplicationModel;
import com.review2.project.model.LoginModel;
import com.review2.project.model.UserModel;
import com.review2.project.repository.AdminRepo;
import com.review2.project.repository.LoanApplicationRepo;
import com.review2.project.repository.LoginRepo;
import com.review2.project.repository.UserRepo;

import jakarta.transaction.Transactional;

@Service

public class LoanService {
	@Autowired
    public AdminRepo arepo;
	@Autowired
     public LoanApplicationRepo loanrepo;
     @Autowired
     public LoginRepo lrepo;
     @Autowired 
     
     public UserRepo urepo;
     
    //AdminModel
     public AdminModel post1(AdminModel amodel)
     {
    	 return arepo.save(amodel);
     }
     
     public List<AdminModel> get1()
     {
    	 return arepo.findAll();
     }
     
     public AdminModel put1(AdminModel amodel1)
     {
    	 return arepo.saveAndFlush(amodel1);
     }
     @Transactional
     
     public void delete1(String password)
     {
    	 arepo.deleteByPassword(password);
     }
     
     //LoanApplicationModel
     public LoanApplicationModel post2(LoanApplicationModel amodel2)
     {
    	 return loanrepo.save(amodel2);
     }
     
     public List<LoanApplicationModel> get2()
     {
    	 return loanrepo.findAll();
     }
     
     public LoanApplicationModel put2(LoanApplicationModel amodel3)
     {
    	 return loanrepo.saveAndFlush(amodel3);
     }
     @Transactional
     
     
     public void delete2(int loanid)
     {
    	 loanrepo.deleteById(loanid);
     }
     
     //LoginModel
     public LoginModel post3(LoginModel amodel4)
     {
    	 return lrepo.save(amodel4);
     }
     
     public List<LoginModel> get3()
     {
    	 return lrepo.findAll();
     }
     
     public LoginModel put3(LoginModel amodel5)
     {
    	 return lrepo.saveAndFlush(amodel5);
     }
     @Transactional
     public void delete3(String password)
     {
    	 lrepo.deleteByPass(password);
     }
     
     //UserModel
     
     public UserModel post4(UserModel amodel6)
     {
    	 return urepo.save(amodel6);
     }
     
     public List<UserModel> get4()
     {
    	 return urepo.findAll();
     }
     
     public UserModel put4(UserModel amodel7)
     {
    	 return urepo.saveAndFlush(amodel7);
     }
     @Transactional
     
     public void delete4(int id)
     {
    	 urepo.deleteById(id);
     }

}
