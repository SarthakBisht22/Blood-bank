package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_bloodbank {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarth\\OneDrive\\Desktop\\Automation Testing\\Browser extension\\chromedriver.exe");
		Select s;
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);
		
		//Registration button
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(5000);
		
		//First name
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtName")).sendKeys("Sarthak");
		Thread.sleep(2000);
		//Email
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtEmail")).sendKeys("sarthakbisht1213@gmail.com");
		Thread.sleep(2000);
		//mobile number
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtMobile")).sendKeys("8800657732");
		Thread.sleep(2000);
		//Create password
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLoginPassword")).sendKeys("sarthak@123");
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement w=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UpdatePanel1\"]/div[2]/div/div[1]/div/div/h3[2]"));
		js.executeScript("arguments[0].scrollIntoView();",w);

		
		//Blood groups
		 driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboBloodGroup-button\"]/span[1]")).click();
		Thread.sleep(2000);
		WebElement bloodgroupoption=driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]"));
		bloodgroupoption.click();
		
		//Gender
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboGender-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]")).click();
		Thread.sleep(2000);
		
		
		//Birthdate
		s=new Select(driver.findElement(By.id("ctl00$ContentPlaceHolder1$cboDobDay")));
		s.selectByValue("22");
		Thread.sleep(2000);
		
		
		//	Month
		s=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboDobMonth")));
		s.selectByValue("Jan");
		Thread.sleep(2000);
		
		//Year
		s=new Select(driver.findElement(By.id("ctl00$ContentPlaceHolder1$cboDobYear")));
		s.selectByValue("2001");
		Thread.sleep(2000);
		
		//Weight
		driver.findElement(By.id("ctl00$ContentPlaceHolder1$txtWeight")).sendKeys("80");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		

	}

}
