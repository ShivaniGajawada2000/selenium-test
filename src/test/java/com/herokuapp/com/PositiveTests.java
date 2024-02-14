package com.herokuapp.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PositiveTests {
    @Test
	public void loginTest() {
         //create driver
		
		WebDriver driver=new ChromeDriver();
		sleep(1);
		
//		open test page
		String url="http://the-internet.herokuapp.com/login";
		driver.get(url);
		sleep(1);
		//maximizes the window
		driver.manage().window().maximize();
		//command to slow down the tests just for an idea
		
		sleep(1);
	
		System.out.println("page opned");
		
		
		
		
//		enter username
//		enter pwd
//		click login button
//		 verifications:
//			 new url
//			 logout button is visible
//			 successful msg displayed
		driver.close();
		System.out.println("Test finished");
		
		
	}
//this method is just for an idea not recommended
	private void sleep(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
