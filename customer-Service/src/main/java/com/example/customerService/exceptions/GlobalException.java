package com.example.customerService.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.customerService.dto.ApiResponse;

public class GlobalException {
	
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> handleResourceNotFoundException(Exception ex){
		
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setMessage(ex.getMessage());
		apiResponse.setSuccess(false);
		apiResponse.setHttpStatus(HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<>(apiResponse, HttpStatus.NOT_FOUND);
		
	}

}
