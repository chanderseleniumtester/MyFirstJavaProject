import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook {
 
	public static void main(String[] args) throws InterruptedException  
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun_PC\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver x = new ChromeDriver();
	
	x.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(x, 10);
	
	x.get("https://www.facebook.com/");
	Thread.sleep(2000);
	WebElement username = x.findElement(By.xpath("//input[@class='inputtext login_form_input_box']"));
	WebElement password = x.findElement(By.xpath("//input[@type='password']"));
	WebElement LogIn = x.findElement(By.xpath("//input[@type='submit']"));
	username.clear();
	username.sendKeys("");
	password.clear();
	password.sendKeys("");
	LogIn.click();
	Thread.sleep(2000);
	Alert alrt;
	alrt = wait.until(ExpectedConditions.alertIsPresent());
	alrt.accept();
	}

}
