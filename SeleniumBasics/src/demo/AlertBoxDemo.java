package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class AlertBoxDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:\\Webdrivers\\IEDriverServer_Win32_2.48.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		//Adding a comment here so as to see the changes in Central Repo
		
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amtrak.com/home");
		
		driver.findElement(By.xpath("//*[@id='subscribe_home']/div[1]/a")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
	}

}
