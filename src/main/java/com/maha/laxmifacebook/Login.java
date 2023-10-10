package com.maha.laxmifacebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ss\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("mahalaxmikaranam@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		
	}
}

