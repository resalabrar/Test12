package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.db.ReadFile;

public class BaseTest {
	Properties prop;
	WebDriver driver;
	
	@Before 
	public void start() throws IOException {
		
	 prop= ReadFile.readPropFile("/Users/resalabrar/eclipse-workspace/POMPproject/Config.properties ");
	String value=	prop.getProperty("browser");
		if(value.contentEquals("chrome"))
		{
			driver= new ChromeDriver();
		
		} else if (value.contentEquals("firefox"))
		{
			driver= new FirefoxDriver();
			
		}
		driver.get(prop.getProperty("url"));
	}
	  
 
	
	
	
	
}
