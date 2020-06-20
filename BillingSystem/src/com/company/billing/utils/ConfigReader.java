package com.company.billing.utils;

import java.util.ResourceBundle;

public interface ConfigReader {

	String USERID = "userID";
	String PASSWORD = "pwd";
	String DBURL = "dbURL";
	String DRIVER = "driverClass";
	
	ResourceBundle rb = ResourceBundle.getBundle("config");
	
}
