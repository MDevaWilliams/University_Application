package com.Springboot.examMs3.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.examMs3.Entity.UniversityApplication;
import com.Springboot.examMs3.Repository.UniversityRepository;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository repository;

	// to add the data
	public UniversityApplication adddata(UniversityApplication data) {
		return repository.save(data);
	}

	// to get the data based on id
	public UniversityApplication getdataById(int id) {
		return repository.findById(id).orElse(null);
	}

	// to get all data
	public List<UniversityApplication> getAlldata() {
		return repository.findAll();
	}

	

	// to edit the data
	public UniversityApplication editdata(UniversityApplication data) {
		UniversityApplication ExistingData = repository.findById(data.getId()).orElse(null);
		ExistingData.setUniversityname(data.getUniversityname());
		ExistingData.setTotalclgs(data.getTotalclgs());
		return repository.save(ExistingData);
	}

	// to delete data
	public String deletedata(int id) {
		repository.deleteById(id);
		return "Data deleted";
	}


}
