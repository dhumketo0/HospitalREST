package com.MyHospital.One.HExceptionHandlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handleResourceNotFoundException(ResourceNotFoundException ex) {
        // Set the desired response message and status code
		String message=ex.getMessage();
		ApiResponse res=new ApiResponse(message,true);
		return new ResponseEntity<ApiResponse>(res,HttpStatus.NOT_FOUND);
	}
}
