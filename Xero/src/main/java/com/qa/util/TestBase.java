package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public static WebDriver driver;
    public static Properties prop;
	
	public TestBase() 
		{
		     try
		     {
		    	 prop = new Properties();
		     FileInputStream ip = new FileInputStream("C:\\Users\\Administrator\\eclipse-workspace\\Xero\\src\\main\\java\\com\\qa\\config\\config.properties");
		     prop.load(ip);
		     }catch (FileNotFoundException e) {
		        e.printStackTrace();
		        }catch (IOException e) {
		     e.printStackTrace();
			}
		        }
	
		public static void initialization()
		{
			String browser=prop.getProperty("browser");
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Administrator\\\\Videos\\\\CHROMEDRIVER\\\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();

			driver.get(prop.getProperty("url"));
		}  

}
