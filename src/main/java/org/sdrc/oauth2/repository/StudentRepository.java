package org.sdrc.oauth2.repository;

import java.util.List;

import org.sdrc.oauth2.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	@Override
	public List<Student> findAll();
	
	@Override
	public <S extends Student> S save(S arg0);

}
