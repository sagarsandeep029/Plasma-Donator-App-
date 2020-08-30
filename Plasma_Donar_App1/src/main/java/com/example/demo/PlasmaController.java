package com.example.demo;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.PlasmaDonar;
import com.example.demo.PlasmaService;

@RestController
public class PlasmaController {
	
	@Autowired
	private PlasmaService plasmaservice;
	

	@CrossOrigin
	@RequestMapping("/donars")
	public java.util.List<PlasmaDonar> getAllDonars() {
		
		return plasmaservice.getAllDonars();
	
	}
	@CrossOrigin
	@RequestMapping("/donars/{id}") 
	public Optional<PlasmaDonar> getDonar(@PathVariable String id) {
	
		return plasmaservice.getDonar(id);	
	}
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, value= "/donars")
	public void addDonar(@RequestBody PlasmaDonar newdon) {
		plasmaservice.addDonar(newdon);
	
	}
	
	
}









