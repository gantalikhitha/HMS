package com.project.demo.Domain;

public class BillingdetailsDomain {
	private int bid;
	private int patientid;
	private String patientname;
	private long mobileno;
	private String address;
	private int doctorid;
	private double totalamount;
	
	private UserDomain hospital;

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

	public int getDoctorid() {
		return doctorid;
	}

	public void setDoctorid(int doctorid) {
		this.doctorid = doctorid;
	}

	public double getTotalamount() {
		return totalamount;
	}

	public void setTotalamount(double totalamount) {
		this.totalamount = totalamount;
	}

	public UserDomain getHospital() {
		return hospital;
	}

	public void setHospital(UserDomain hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "BillingdetailsDomain [bid=" + bid + ", patientid=" + patientid + ", patientname=" + patientname
				+ ", mobileno=" + mobileno + ", address=" + address + ", doctorid=" + doctorid + ", totalamount="
				+ totalamount + ", hospital=" + hospital + "]";
	}
	
	
	

}
