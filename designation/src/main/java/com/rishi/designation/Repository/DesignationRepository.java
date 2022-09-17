package com.rishi.designation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rishi.designation.Entity.Designation;

@Repository
public interface DesignationRepository extends JpaRepository<Designation, Long> {

}
