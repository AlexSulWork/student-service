package telran.java52.student.dto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StudentNotFoundAcception extends RuntimeException {

	
	private static final long serialVersionUID = 1L;

	

}
