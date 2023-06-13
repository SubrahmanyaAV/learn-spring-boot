package com.cruds.simplespringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Courses> retrieveAllCourses()
	{
		return Arrays.asList(
				new Courses(1, "Java","Oracle"),
				new Courses(2, "Spring","Spring"),
				new Courses(3, "spring boot","Spring"),
				new Courses(4, "devtools","Spring")
				);
	}

}
