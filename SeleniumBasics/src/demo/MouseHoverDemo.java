package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.onlinesbi.com/");
		
		WebElement x = driver.findElement(By.linkText("FAQ"));
		Actions action = new Actions(driver);
		action.moveToElement(x).build().perform();
		
		driver.findElement(By.linkText("Corporate Banking FAQ")).click();
		
		
	}

}
