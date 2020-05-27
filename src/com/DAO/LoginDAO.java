package com.DAO;

import java.sql.ResultSet;

import com.model.LoginModel;

public interface LoginDAO
{

		public abstract int saveData(LoginModel model);
		public abstract ResultSet getData();
		public abstract int deleteData();
		
}
