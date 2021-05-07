package eticaretSystem.business.concretes;

import eticaretSystem.business.abstracts.LoggerService;

public class LoggerManager implements LoggerService {

	@Override
	public void send(String message) {
		System.out.println("Email Gönderildi " + message);
		
	}
	
}
