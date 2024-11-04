package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("u_0_0_3L")).sendKeys(Keys.ENTER);
		
//		driver.findElement(By.id("email")).sendKeys("Rutuja");
//		
//		driver.findElement(By.id("pass")).sendKeys("Panchal");
//		
//		driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
		
		Thread.sleep(2000);
		
		

	}

}
