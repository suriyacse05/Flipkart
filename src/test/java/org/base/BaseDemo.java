package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseDemo {
	public static WebDriver driver;
	public static void getDriver(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SampleBase\\src\\test\\resources\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			
		}}
	public static void url(String url) {
		driver.get(url);
	}
	public static WebElement locator (String locator, String attributevalue) {
	if(locator.equalsIgnoreCase("id")) {
		WebElement findElement=driver.findElement(By.id(attributevalue));
		return findElement;
		
	}
	else if(locator.equalsIgnoreCase("name")) {
		WebElement findElement=driver.findElement(By.name(attributevalue));
		return findElement;
		
	}
	else if(locator.equalsIgnoreCase("xpath")) {
		WebElement findElement=driver.findElement(By.xpath(attributevalue));
		return findElement;
		
	}
	else {
		WebElement findElement=driver.findElement(By.tagName(attributevalue));
		return findElement;
		
	}
}
	public static void textSend(WebElement element, String attributeValue) {
		element.sendKeys(attributeValue);
		
	}
	public static void textClick(WebElement element) {
		element.click();
	}
	public static void screenShot(String screenShot) throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File source=tk.getScreenshotAs(OutputType.FILE);
		File des=new File ("C:\\Screenshot"+screenShot+".jpeg");
		FileUtils.copyFile(source, des);
		
		
	}
	public static void  quiteBrowser() {
		driver.quit();
	}
	}
	






