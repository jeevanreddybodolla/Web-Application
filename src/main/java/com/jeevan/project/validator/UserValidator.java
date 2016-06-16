package com.jeevan.project.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.jeevan.project.pojo.UserTable;



public class UserValidator implements Validator{
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserTable.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		// TODO Auto-generated method stub
		UserTable user = (UserTable)target;
			
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "validate.username", "Please enter UserName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userpassword", "validate.password", "Please enter Password");
		
	}
	

	
}
