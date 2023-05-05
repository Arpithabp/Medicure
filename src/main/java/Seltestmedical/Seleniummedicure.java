package Seltestmedical;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniummedicure {

	public static void main(String[] args) {
		System.out.println("Welcome");
		 //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); 
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
		 ChromeOptions chromeOptions = new ChromeOptions();  
		 chromeOptions.addArguments("--remote-allow-origins=*", "ignore-certificate-errors");
         chromeOptions.addArguments("---headless");
         chromeOptions.addArguments("--no-Sandbox");
		 chromeOptions.addArguments("--disable-dev-shm-usage");
		 chromeOptions.addArguments("--remote-allow-origins=");
		 
		 WebDriver driver = new ChromeDriver(chromeOptions);
		 System.out.println("welcome to selenium test scripts");
		 driver.get("http://15.206.147.215:32006/contact.html");
         driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
         driver.manage().window ().maximize();
         
         WebElement inputField = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Your Name']"));
         inputField.sendKeys("Arp");
         
         WebElement inputField1 = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Phone Number']"));
         inputField1.sendKeys("9742265434");
         
         WebElement inputField2 = driver.findElement(By.xpath("//input[@type='email']"));
         inputField2.sendKeys("arpitha2000.p@gmail.com");
         
         driver.findElement(By.className("message-box")).sendKeys("How Are You?");
         
         //driver.findElement(By.className("bin_box")).click();
         		
         
        
	}

}
