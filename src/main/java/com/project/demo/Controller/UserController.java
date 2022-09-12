package com.project.demo.Controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.demo.Entity.Appointment;
import com.project.demo.Entity.Patient;
import com.project.demo.Entity.UserEntity;
import com.project.demo.Service.AppointmentService;
import com.project.demo.Service.HospitalService;
import com.project.demo.Service.PatientService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private HospitalService hospitalService;

	@Autowired
	private PatientService patientService;
	@Autowired
	private AppointmentService appointmentService;

	@GetMapping("/home")
	public String home() {
		return "home";
	}

	@GetMapping("/userhome")
	public String get() {
		return "user_home";
	}

	@GetMapping("/patient")
	public String patient() {
		return "patientlogin";
	}

	@GetMapping("/appo")
	public String appointment() {
		return "appointment";
	}

	@PostMapping("/post")
	public String patient(@ModelAttribute Patient patient, Principal principal) {
		UserEntity entity = hospitalService.findByemail(principal.getName());
		patient.setHospital(entity);
		patientService.save(patient);
		return "user_home";
	}

	@PostMapping("/add")
	public String appointment(@ModelAttribute Appointment appointment, Principal principal) {
		UserEntity user = hospitalService.findByemail(principal.getName());
		appointment.setHospital(user);
		appointmentService.save(appointment);
		return "success";
	}

}
