package com.am.sms.security;

public interface SecurityService {

	//current logged In user.
	String findLoggedInUsername();
	
	//Auto Login after Registration...
	void autoLogin(String email, String password);
	
	
}
