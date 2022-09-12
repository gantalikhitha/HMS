package com.project.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.Entity.BillingDetails;
import com.project.demo.Entity.Patient;
import com.project.demo.Repository.BillingDetailsRepository;

@Service
public class BillingDetailsService {
	
	@Autowired
	private BillingDetailsRepository repo;

	public BillingDetails getById(int billid) {
		// TODO Auto-generated method stub
		return repo.findById(billid).orElse(null);
	}

	public BillingDetails save(BillingDetails billingDetails) {
		return repo.save(billingDetails);
		
	}

	public BillingDetails getByid(int billid) {
		// TODO Auto-generated method stub
		return repo.findById(billid).orElse(null);
	}

}
