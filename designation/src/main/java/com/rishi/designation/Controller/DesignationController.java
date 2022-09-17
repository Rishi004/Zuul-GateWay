package com.rishi.designation.Controller;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rishi.designation.Dto.DesignationDto;
import com.rishi.designation.Entity.Designation;
import com.rishi.designation.Services.DesignationService;

@RestController
@RequestMapping("/designation")
public class DesignationController {
	
	@Autowired
	private DesignationService designationService;
	
	@PostMapping(value = "/")
	public ResponseEntity<Object> addDesignation (@Valid @RequestBody DesignationDto designationDto) {
		Designation designation = new Designation();
		BeanUtils.copyProperties(designationDto, designation);
		designationService.addDesignation(designation);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Object> getDesignation (@PathVariable Long id) {
		Designation designation = designationService.getDesignationById(id);
		return new ResponseEntity<Object>(designation, HttpStatus.OK);
	}
}
