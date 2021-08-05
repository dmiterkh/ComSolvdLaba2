package com.solvd.mobileoperator.utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.apache.log4j.Logger;

import com.solvd.mobileoperator.executor.Executor;

public class SeleniumWebdriver {

	private final static Logger LOGGER = Logger.getLogger(Executor.class);
	
	public void showSeleniumDriverChrome() {
		
		LOGGER.info("Chrome driver has been launched successfully");
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webdrivers\\bin\\chromedriver.exe"); //One before latest version - works
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver\\bin\\chromedriver.exe"); //The latest version - does not work 
//		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		
		WebDriver driverCh = new ChromeDriver();
		driverCh.get("http://google.com");


		WebElement elem = driverCh.findElement(By.xpath("//a[text()='English']"));
		elem.click();
		WebElement elem1 = driverCh.findElement(By.xpath("//a[text()='Gmail']"));
		elem1.click();
		WebElement elem2 = driverCh.findElement(By.xpath("//*[text()='For work']"));
		elem2.click();
		WebElement elem3 = driverCh.findElement(By.xpath("//a[text()='Admin console']"));
//		WebElement elem3 = driverCh.findElement(By.cssSelector("[data-g-action='admin console']"));
		elem3.click();
		
//		WebElement input = driverCh.findElement(By.xpath("//input[@aria-label='Gmail']"));
//		WebElement inputs = driverCh.findElements(By.xpath("//input[@aria-label='Пошук Google']"));
//		WebElement input2 = driverCh.findElement(By.cssSelector(null));
		
//		WebElement input = driverCh.findElement(By.xpath("//input[@aria-label='Найти']"));	
//		input.Input.insertText("LINKEDIN");
//		WebElement element = driverCh.findElement(By.xpath("//a[@title='YouTube']"));
//		element.click();
		
//		//div[@class = 'g'][6]	
//		//div[@class = 'g'][last]
//		//*[text()='Linkedin - Википедия']
//		//span[contains(text()='Википедия')]
//		//h3[contains(@class='LC20')]
//		$$("body")	
//		$$("#_zdfsfv")
//		$$("[role='main']")		
//		$$("[role*='ai']")	
//		$$("[role^='ma']")	
//		$$("[role$='in']")	
//		$$(".class1.class2.class3")		
//		$$("div:not(.class1)")		
//		$$("a:not(href^='http')")
//		$$("div[role='main'] div.class1") // son, grandson, ...		
//		$$("div[role='main'] > div.class1") // child only	
//		$$("ul li:first-child")	
//		$$("ul li:last-child")	
//		$$("ul li:nth-child(2)")	
//				
		
		LOGGER.info("Chrome driver has been finished successfully");
	}

	
	public void showSeleniumDriverFirefox() {
		
		LOGGER.info("Firefox driver has been launched successfully");
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\webdrivers\\bin\\geckodriver.exe");		
		WebDriver driverFi = new FirefoxDriver();
		driverFi.get("https://google.com");
		
		WebElement elem = driverFi.findElement(By.xpath("//a[text()='English']"));
		elem.click();
		WebElement elem1 = driverFi.findElement(By.xpath("//a[text()='Gmail']"));
		elem1.click();
		
		LOGGER.info("Firefox driver has been finished successfully");
	}
	
	
	public void showSeleniumDriverEdge() {
		
		LOGGER.info("Edge driver has been launched successfully");
		
		System.setProperty("webdriver.edge.driver", "C:\\Program Files\\webdrivers\\bin\\msedgedriver.exe");		
		WebDriver driverEd = new EdgeDriver();
		driverEd.get("https://google.com");
		
		WebElement elem = driverEd.findElement(By.xpath("//a[text()='English']"));
		elem.click();
		WebElement elem1 = driverEd.findElement(By.xpath("//a[text()='Gmail']"));
		elem1.click();
		
		LOGGER.info("Edge driver has been finished successfully");
		
	}
	
	
	public void showSeleniumDriverIE() {
		
		LOGGER.info("IE driver has been launched successfully");
		
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\webdrivers\\bin\\selenium-java-4.0.0-alpha-1\\client-combined-4.0.0-alpha-1-sources.exe");		
		WebDriver driverIE = new InternetExplorerDriver();
		driverIE.get("https://www.google.com");
		
		WebElement elem = driverIE.findElement(By.xpath("//a[text()='English']"));
		elem.click();

		LOGGER.info("Edge driver has been finished successfully");
		
	}

}


