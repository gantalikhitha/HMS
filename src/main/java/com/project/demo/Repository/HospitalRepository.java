package com.project.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.project.demo.Domain.UserDomain;
import com.project.demo.Entity.BillingDetails;
import com.project.demo.Entity.Doctor;
import com.project.demo.Entity.UserEntity;

@Repository
public interface HospitalRepository extends JpaRepository<UserEntity, Integer> {

	//String deleteById(int hid);

	UserEntity getByhid(int hid);
	//UserEntity getByHname(String hname);

	UserEntity findByHname(String username);

	Doctor save(Doctor doctor);

	BillingDetails save(BillingDetails billingDetails);
	UserEntity findByemail(String email);

	

	

}
