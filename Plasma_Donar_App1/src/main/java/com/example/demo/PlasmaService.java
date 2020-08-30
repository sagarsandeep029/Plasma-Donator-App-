package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlasmaService {

	@Autowired
	private PlasmaRepository plasmarepository;
	
	public List<PlasmaDonar> getAllDonars() {
	
		List<PlasmaDonar> donars = new ArrayList<PlasmaDonar>();
		
		plasmarepository.findAll().forEach(donars::add);
		
		return donars;
	
	}
	
	public Optional<PlasmaDonar> getDonar(String id) {
		return plasmarepository.findById(id);
	}
	
	public void addDonar(PlasmaDonar don) {
		plasmarepository.save(don);
	}
	
	
	
}


