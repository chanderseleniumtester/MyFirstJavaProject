package TestSuite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class General {


		WebDriver x=null;
		WebDriverWait wait;
		Alert alrt;
		WebElement objUN;
		WebElement objPWD;
		@Given("^OpenHRM WebPage$")
		public void openBrowser() throws Exception
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun_PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
			x = new ChromeDriver();
			x.manage().window().maximize();
			wait = new WebDriverWait(x, 30);
			x.get("http://apps.qaplanet.in/hrm/login.php");
			Thread.sleep(1000);
			System.out.println(x.getTitle());
		}
		
		
		
			@Then("^User verified home page$")
			public void VerifyHOmePage()
			{
				if (x.getTitle().equals("OrangeHRM - New Level of HR Management")) {
				System.out.println("Home Page is Verified");	
				}
			}
			
			@And("^verify user name$")
			public void VerifyUserName()
			{
				objUN =x.findElement(By.xpath("//input[@name='txtUserName']"));
				
				if (objUN.isDisplayed()) {
					System.out.println("UN is verified");
				}else {
					System.out.println("UN is not verified");
				}
				
			}
			
			@And("^verify password$")
			public void VerifyPassword()
			{
				objPWD = x.findElement(By.xpath("//input[@name='txtPassword']"));
				if (objPWD.isDisplayed()) {
					System.out.println("PWD is verified");
				}
				else {
					System.out.println("PWD is not verified");
				}
			}
		@When("^I Enter user name$")
		public void EnterUserName()
		{
			objUN.clear();
			objUN.sendKeys("qaplanet1");
		}
     
		@And("^Enter password$")
		public void EnterPassword()
		{
		objPWD.clear();
		objPWD.sendKeys("lab1");
		}
		
		@And("^Click on login$")
		public void ClickOnPassword() throws InterruptedException
		{
		  WebElement objLogin =	x.findElement(By.xpath("//input[@name='Submit']"));
		  objLogin.click();
		  Thread.sleep(1000);
		 System.out.println(x.getTitle()); 
		}
	
		@Then("^Check OrangeHRM Page$")
		public void VerifyOrangePage()
		{
		    if (x.getTitle().equals("OrangeHRM"))
		     {
			System.out.println("OrangeHRM Page is verified");
		     }
		    else 
		    {
		 	System.out.println("OrangeHRM Page is not verified");
		    }
		}
		
		@Then("^Click on logout$")
		public void ClickOnLogout() throws InterruptedException
		{
			WebElement objLogOut = x.findElement(By.linkText("Logout"));
			if (objLogOut.isDisplayed()) {
				System.out.println("objLogOut is verified");
			}else {
				System.out.println("objLogOut is not verified");
			}
			objLogOut.click();
			Thread.sleep(1500);
			x.close();
			x.quit();
		}
	}
