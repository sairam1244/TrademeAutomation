package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinspection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.trademe.co.nz/");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
