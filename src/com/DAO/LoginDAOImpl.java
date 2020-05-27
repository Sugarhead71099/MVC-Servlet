package com.DAO;

import java.sql.ResultSet;

import com.model.LoginModel;

public class LoginDAOImpl  implements LoginDAO
{

	public LoginModel login;
	private DBManager DB;

	public LoginDAOImpl() {}

	public LoginDAOImpl(LoginModel login)
	{
		this.login = login;
		this.DB = new DBManager("localhost:1521", "orcl", "system", "system");

		DB.connect();
		System.out.println("connection Done");
	}

	@Override
	public int saveData(LoginModel login)
	{		   
		int rowsChanged = DB.insert("users", new String[] { "username", "password" }, new Object[] { login.getUsername(), login.getPassword() });
		
		System.out.println(rowsChanged + " rows were inserted.");

		return rowsChanged;
	}

	@Override
	public ResultSet getData()
	{
		return DB.select("users", new String[] { "username", "password" }, "username = ?", new Object[] { login.getUsername() });
	}

	@Override
	public int deleteData()
	{
		return DB.delete("users", "username = ?", new Object[] { login.getUsername() });
	}

}