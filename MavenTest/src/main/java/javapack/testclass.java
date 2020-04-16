package javapack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {
	
	WebDriver driver;
	@beforesuite
	public void setup()
	{
	driver=new ChromeDriver();

	}
	@test
	public void launch()
	{
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

}
