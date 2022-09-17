package com.rishi.designation.Services;

import com.rishi.designation.Entity.Designation;

public interface DesignationService {
	
	public void addDesignation (Designation designation);
	
	public Designation getDesignationById(Long id);
}
