package com.project.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="billing")
public class BillingDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private int patientid;
	private int doctorid;
	private String patientname;
	private long mobileno;
	private String address;
	private double totalamount;
	
	@ManyToOne(fetch = FetchType.EAGER)
	//@JoinColumn(name="hid",referencedColumnName = "hid")
	@JsonBackReference
	private UserEntity hospital;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public int getPatientid() {
		return patientid;
	}

	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public UserEntity getHospital() {
		return hospital;
	}

	public void setHospital(UserEntity hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "BillingDetails [bid=" + bid + ", patientid=" + patientid + ", doctorid=" + doctorid + ", patientname="
				+ patientname + ", mobileno=" + mobileno + ", address=" + address + ", totalamount=" + totalamount
				+ ", hospital=" + hospital + "]";
	}
	
	
	
	
	
	

}
