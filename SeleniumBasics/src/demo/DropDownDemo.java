package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://facebook.com");
		
		WebElement x = driver.findElement(By.id("month"));
		
		Select drpDown = new Select(x);
		//drpDown.selectByVisibleText("Apr");
		
		drpDown.selectByIndex(5);
		
		
		
	}

}
