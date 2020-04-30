package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.log.Log;

public class Facebook {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tarun_PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		x.manage().window().maximize();	
		WebDriverWait wait=new WebDriverWait(x, 40);
		Actions Act=new Actions(x);
		Robot rt = new Robot();
		x.get("https://www.flipkart.com/");
		
		
		
		
		// Find Webelement for Username, Password, Login
		WebElement username = x.findElement(By.xpath("//form[@autocomplete='on']//input[@type='text']"));
		WebElement password = x.findElement(By.xpath("//form[@autocomplete='on']/div[2]/input"));
		WebElement Login = x.findElement(By.xpath("//form[@autocomplete='on']/div[3]/button"));
		 if (username.isDisplayed()) {
			System.out.println("User Name is verified");
		}
		 else {
			System.out.println("User Name is not verified");
		}
		if (password.isDisplayed()) {
			System.out.println("password is verified");
		}else {
			System.out.println("password is not verified");
		}
		if (Login.isDisplayed()) {
			System.out.println("Login is verified");
		}else {
			System.out.println("Login is not verified");
		}
		username.sendKeys("tarunchander8@yahoo.com");
		password.sendKeys("freedom123");
		Login.click();
		Thread.sleep(20000);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		//alert = x.switchTo().alert();
//		alert.accept();
		
		rt.keyPress(KeyEvent.VK_ESCAPE);
				rt.keyRelease(KeyEvent.VK_ESCAPE);
		WebElement menu = x.findElement(By.xpath("//div[@id='userNavigationLabel']"));
		if (menu.isDisplayed()) {
			System.out.println("menu is verified");
		}else {
			System.out.println("menu is not verified");
		}
		Act.moveToElement(menu).perform();
		Act.click(menu).perform();
	
				WebElement Logout = x.findElement(By.xpath("//div[@class='uiContextualLayerPositioner uiLayer uiContextualLayerPositionerFixed']//div[@class='uiScrollableAreaContent']//li[9]"));
		if (Logout.isDisplayed()) {
			System.out.println("Logout is verified");
		}else {
			System.out.println("Logout is not verified");
		}
		Act.moveToElement(Logout).perform();
		Act.click(Logout).perform();
		Thread.sleep(2000);
		
		
		
		
		
		
		
	}

}
