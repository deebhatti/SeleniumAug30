package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment {
	
	

		  public static void main(String[] args){
		        WebDriver driver = new FirefoxDriver();
		        driver.get("https:www.facebook.com/");

//		        driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
//
//		        driver.findElement(By.id("pass")).sendKeys("password");
		 
//		        driver.findElement(By.xpath("//*[id='loginbutton']")).click();

		        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("xyz@gmail.com");

		        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("password");

		        driver.findElement(By.cssSelector("input[type='submit']")).click();
		        	
		        		
		  }	


}
