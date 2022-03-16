package com.fun.ben.runeword;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.fun.ben.runeword.exception.RuneNotFoundException;
import com.fun.ben.runeword.pojo.ExceptionMessage;

@EnableWebMvc
@ControllerAdvice
public class CommonExceptionHandler extends ResponseEntityExceptionHandler 
{
	@ExceptionHandler(value = { RuneNotFoundException.class })
    protected ResponseEntity<Object> handleRuneNotFound(RuntimeException ex, WebRequest request) 
	{
		ExceptionMessage em = new ExceptionMessage();
		em.setCode("-9");
		em.setMessage("Your requested param: " + ex.getLocalizedMessage() + " is not a valid Rune");
		em.setRequest(request.toString());
		em.setException(ex.getClass().getSimpleName());
		
		return new ResponseEntity<>(em, HttpStatus.NOT_FOUND);
    }

}
