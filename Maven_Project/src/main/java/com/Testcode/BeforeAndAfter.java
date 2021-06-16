package com.Testcode;

import java.io.IOException;
import java.sql.SQLException;
import java.util.InvalidPropertiesFormatException;
//import org.apache.poi.openxm14j.exceptions.InvalidFormatException;

import org.testng.annotations.BeforeSuite;

import freemarker.template.utility.Constants;

public class BeforeAndAfter {
	
	@BeforeSuite
	public void beforeSuit() throws InvalidPropertiesFormatException , IOException, ClassNotFoundException, SQLException{
		//Constants.startInfobank();
		
	}

}
