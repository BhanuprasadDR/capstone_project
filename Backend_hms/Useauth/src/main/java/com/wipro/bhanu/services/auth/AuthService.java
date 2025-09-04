package com.wipro.bhanu.services.auth;

import com.wipro.bhanu.dto.SignupRequest;
import com.wipro.bhanu.dto.UserDto;

public interface AuthService 
{

	UserDto signupUser(SignupRequest signupRequest);
	boolean hasUserWithEmail(String email);
}
