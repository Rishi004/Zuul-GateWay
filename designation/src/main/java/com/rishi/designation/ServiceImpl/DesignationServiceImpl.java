package com.rishi.designation.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rishi.designation.Entity.Designation;
import com.rishi.designation.Repository.DesignationRepository;
import com.rishi.designation.Services.DesignationService;

@Service
public class DesignationServiceImpl implements DesignationService {
	
	@Autowired
	private DesignationRepository designationRepository;

	@Transactional
	public void addDesignation(Designation designation) {
		designationRepository.save(designation);
	}

	@Transactional(readOnly = true)
	public Designation getDesignationById(Long id) {
		return designationRepository.findById(id).get();
	}

}
