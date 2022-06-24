package com.Springboot.examMs3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Springboot.examMs3.Entity.UniversityApplication;

public interface UniversityRepository extends JpaRepository <UniversityApplication, Integer> {

}
