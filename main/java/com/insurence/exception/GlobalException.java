package com.insurence.exception;

import java.time.LocalDate;
import java.util.stream.Collectors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;



@ControllerAdvice
@RestController
public class GlobalException extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = CustomerNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleException(CustomerNotFoundException exception, WebRequest request) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), LocalDate.now(),
				request.getDescription(false));
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(value = PolicyNotAvailableException.class)
	public ResponseEntity<ErrorMessage> handleException(PolicyNotAvailableException exception, WebRequest request) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), LocalDate.now(),
				request.getDescription(false));
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = PolicyNotRegisterdException.class)
	public ResponseEntity<ErrorMessage> handleException(PolicyNotRegisterdException exception, WebRequest request) {
		ErrorMessage errorMessage = new ErrorMessage(exception.getMessage(), LocalDate.now(),
				request.getDescription(false));
		return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);
	}
	@Override
    public ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException  argInvalidException, HttpHeaders headers,
            HttpStatus status, WebRequest request) {
		ErrorMessage errorMessage = new ErrorMessage();
		errorMessage.setCode("Error Message");
        String allFieldErrors = argInvalidException.getBindingResult().getFieldErrors().stream()
                .map(e -> e.getDefaultMessage()).collect(Collectors.joining(", "));
        errorMessage.setMessage(allFieldErrors);
        return new ResponseEntity<Object>(errorMessage, HttpStatus.BAD_REQUEST);
    }
	
}
