package com.project.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.Entity.BillingDetails;

@Repository
public interface BillingDetailsRepository extends JpaRepository<BillingDetails, Integer>{

	void save(int bid);

	

}
