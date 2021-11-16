package ecommercesystem.core;

import ecommercesystem.Google.JGoogle;

public class GoogleAdapter implements GoogleService{
	@Override
	public void send(String email, String message) {
		JGoogle googleLogin = new JGoogle();
		googleLogin.googleLogin(email, message);
		
		
	}

}
