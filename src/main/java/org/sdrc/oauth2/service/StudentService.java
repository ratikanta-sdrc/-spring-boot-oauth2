package org.sdrc.oauth2.service;

import java.util.List;

import org.sdrc.oauth2.model.Student;

public interface StudentService {

	org.sdrc.oauth2.domain.Student create(Student student);
	
	List<org.sdrc.oauth2.domain.Student> getAll();
}
