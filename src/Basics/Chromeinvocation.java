package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Chromeinvocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sai\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//maximise chrome window.
		driver.manage().window().maximize();
		//navigating to website
		driver.get("http://www.trademe.co.nz/");
		//slecting marketplace
		driver.findElement(By.xpath(".//*[@id='SearchTabs1_MarketplaceAnchor']/a")).click();
		driver.findElement(By.xpath(".//*[@id='mainContent']/div/div[1]/div/div[2]/div/div[2]/ul/li[6]/a")).click();	
		//clicking on regions
		driver.findElement(By.xpath(".//*[@id='LocationFilter_regionSelect']")).click();
		//Selecting regions from drop down list
		WebElement mySelectRegion = driver.findElement(By.id("LocationFilter_regionSelect"));
		Select mySelectR= new Select(mySelectRegion);
		mySelectR.selectByValue("12");
		//selecting districts from dropdown list
		WebElement mySelectdistrict = driver.findElement(By.id("LocationFilter_districtSelect"));
		Select mySelectD= new Select(mySelectdistrict);
		mySelectD.selectByVisibleText("Wellington City");
		//selecting category
		driver.findElement(By.xpath(".//*[@id='CategoryNavigator_CategoryPlaceholder']/table/tbody/tr/td[1]/ul/li[2]/a")).click();
		//selecting iphone
		driver.findElement(By.xpath(".//*[@id='CategoryNavigator_CategoryPlaceholder']/table/tbody/tr/td[1]/ul/li[4]/a")).click();
		//selecting iphone 5s
		driver.findElement(By.xpath(".//*[@id='CategoryNavigator_CategoryPlaceholder']/table/tbody/tr/td[2]/ul/li[4]/a")).click();
		//selecting lowest buy products
		driver.findElement(By.xpath(".//*[@id='listingTitleBarSelect']")).click();
		//selecting sort options from dropdown list	
		WebElement sort= driver.findElement(By.id("listingTitleBarSelect"));
		Select mySort=new Select(sort);
		mySort.selectByValue("buynow_asc");
		//selecting condition
		driver.findElement(By.xpath(".//*[@id='ListingsTitle_allnewused_used_link']")).click();
		//selecting filter
		driver.findElement(By.xpath(".//*[@id='ListingsTitle_freeShippingOption']/label")).click();
		
	}

}
