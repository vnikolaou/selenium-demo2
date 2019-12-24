package com.pionware.selenium.demo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class App
{
	@Test
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("http://www.google.com/");

        // Find the text input element by its name

        WebElement element = driver.findElement(By.name("q"));

        // Enter something to search for

        element.sendKeys("Cheese!");

 

        // Now submit the form. WebDriver will find the form for us from the element

        element.submit();

        // Check the title of the page

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit();
	}
}
