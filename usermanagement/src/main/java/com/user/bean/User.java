/**
 * 
 */
package com.user.bean;

/**
 * @author Manasi J. Kale
 *
 */
public class User
{
	private String username;
	private String birthdate;
	
	public User(String username, String birthdate)
	{
		this.username = username;
		this.birthdate = birthdate;
	}
	
	public String getUserName()
	{
		return username;
	}
	
	public String getBirthDate()
	{
		return birthdate;
	}

}





