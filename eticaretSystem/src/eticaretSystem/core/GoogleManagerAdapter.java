package eticaretSystem.core;

import eticaretSystem.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void myConnectionAccount(String message) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.connectionAccount(message);
		
	}
	
}
