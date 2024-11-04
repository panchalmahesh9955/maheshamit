package test;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]")).click();
		List<WebElement> List1=driver.findElements(By.xpath("(//a[contains(text(),'Windows')])[1]]"));
		System.out.println(List1);
		
	  //  driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
	  //	String WindID1=driver.getWindowHandle();
		
		//Set<String> WindID=driver.getWindowHandles();
		
		//Iterator<String>id= WindID.iterator();
		
		//String P=id.next();
		//String C=id.next();
		
	  //	System.out.println(P);
		//System.out.println(C);
	  //System.out.println(WindID1);
	}

}
