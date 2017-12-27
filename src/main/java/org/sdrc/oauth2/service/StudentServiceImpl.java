package org.sdrc.oauth2.service;

import java.util.List;

import org.sdrc.oauth2.model.Student;
import org.sdrc.oauth2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public org.sdrc.oauth2.domain.Student create(Student student) {
		
		
		org.sdrc.oauth2.domain.Student studentDomain = new org.sdrc.oauth2.domain.Student();
		studentDomain.setStudentId(student.getId());
		studentDomain.setName(student.getName());
		
		
		return studentRepository.save(studentDomain);
	}

	@Override
	public List<org.sdrc.oauth2.domain.Student> getAll() {
		return studentRepository.findAll();
	}

}
