package com.caveofprogramming.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.caveofprogramming.model.SiteUser;

public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, SiteUser> {

	@Override
	public boolean isValid(SiteUser value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}

}
