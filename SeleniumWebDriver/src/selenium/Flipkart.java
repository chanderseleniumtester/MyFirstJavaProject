package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tarun_PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver x=new ChromeDriver();
		x.manage().window().maximize();	
		WebDriverWait wait=new WebDriverWait(x, 40);
		Actions Act=new Actions(x);
		Robot rt = new Robot();
		x.get("https://www.flipkart.com/");
		
		
		
		
		// Find Webelement for UserName, Password, Login
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
		Thread.sleep(2000);
		WebElement SearchBar = x.findElement(By.xpath("//div[@id='container']/div/div/div/div[2]/div[2]/form/div/div/input"));
		
		if (SearchBar.isDisplayed()) {
			System.out.println("SearchBar is verified");
		}else {
			System.out.println("SearchBar is not verified");
		}
		SearchBar.clear();
		SearchBar.sendKeys("Nokia");
		x.findElement(By.xpath("//div[@id='container']/div/div/div/div[2]/div[2]/form/div/button")).click();
	
		Thread.sleep(2000);
		
		WebElement nokia = x.findElement(By.xpath("//div[@id='container']/div/div[3]/div[2]//div[@data-id='MOBEWXFKRHBRWFD5']/div/a/div[2]/div/div"));
	    if (nokia.isDisplayed()) {
			System.out.println("nokia is verified");
		}else {
			System.out.println("nokia is not verified");
		}
	    nokia.click();
	    Thread.sleep(2000);
	    String MainWindow= x.getWindowHandle();
	    Set<String> s1= x.getWindowHandles();
	    Iterator<String> i1 =s1.iterator();
	    while (i1.hasNext()) {
			String ChildWindow = (String) i1.next();
			if (ChildWindow.equals(MainWindow)) {
				System.out.println("Main Window");
			}else {
				x.switchTo().window(ChildWindow);
				 WebElement AddtoCart = x.findElement(By.xpath("//div[@id='container']/div/div[3]/div[2]/div/div/div[2]/div/ul/li/button"));
				    AddtoCart.click();
x.findElement(By.xpath("//div[@id='container']/div/div[2]/div[2]/div/div//form/button")).click();
Thread.sleep(2000);
x.switchTo().window(MainWindow);			
			}
		}
	    
	    
	   
	
	
	
	}

}
