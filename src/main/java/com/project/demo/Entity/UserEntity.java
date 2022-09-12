package com.project.demo.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Hospital")
public class UserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@PrimaryKeyJoinColumn
	private Integer hid;

	private String hname;
	private String haddress;
	private String email;
	private String password;
	private String role;

	@OneToMany(mappedBy = "hospital")
	@JsonManagedReference
	private List<Doctor> doctor;

	@OneToMany(mappedBy = "hospital")
	@JsonManagedReference
	private List<Patient> patient;

	@OneToMany(mappedBy = "hospital")
	@JsonManagedReference
	private List<Appointment> appointment;
	
	
	  @OneToMany(mappedBy = "hospital")
	  @JsonManagedReference 
	  private List<BillingDetails> billdetails;
	 
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getHaddress() {
		return haddress;
	}

	public void setHaddress(String haddress) {
		this.haddress = haddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
	}

	public List<Patient> getPatient() {
		return patient;
	}

	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}

	public List<Appointment> getAppointment() {
		return appointment;
	}

	public void setAppointment(List<Appointment> appointment) {
		this.appointment = appointment;
	}

	public void setHid(Integer hid) {
		this.hid = hid;
	}

	
	  public List<BillingDetails> getBilldetails() { return billdetails; }
	  
	  public void setBilldetails(List<BillingDetails> billdetails) {
	  this.billdetails = billdetails; }

	@Override
	public String toString() {
		return "UserEntity [hid=" + hid + ", hname=" + hname + ", haddress=" + haddress + ", email=" + email
				+ ", password=" + password + ", role=" + role + ", doctor=" + doctor + ", patient=" + patient
				+ ", appointment=" + appointment + ", billdetails=" + billdetails + "]";
	}
	 

	

	
}
