package org.sdrc.oauth2.resource;

import java.util.List;

import org.sdrc.oauth2.model.Student;
import org.sdrc.oauth2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/student")	
public class StudentController {
	
	@Autowired
	private StudentService studentService; 

	@PostMapping("create")
	public org.sdrc.oauth2.domain.Student create(@RequestBody Student student){
		return studentService.create(student);
	}
	
	@GetMapping("getAll")
	public List<org.sdrc.oauth2.domain.Student> getAll(){		
		return studentService.getAll();		
	}
}
