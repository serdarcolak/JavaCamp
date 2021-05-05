package Entities;

import Abstract.Entity;

public class Gamer implements Entity {
	private int id;
	private String userName;
	
	public Gamer(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
