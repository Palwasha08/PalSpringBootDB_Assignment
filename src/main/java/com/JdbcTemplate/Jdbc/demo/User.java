package com.JdbcTemplate.Jdbc.demo;

public class User {
	private Integer id;
	private String name;
	private String email;

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setId(int newUserId) {
		// TODO Auto-generated method stub

	}

	public void setName(String string) {
		// TODO Auto-generated method stub

	}

	public void setEmail(String string) {
		// TODO Auto-generated method stub

	}

	public User() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User(Integer id, String name, String email) {

		this.id = id;
		this.name = name;
		this.email = email;
	}

}