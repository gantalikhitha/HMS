package com.project.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@GetMapping("/doctorhome")
	public String doctor() {
		return "Doctor_home";
	}

}
