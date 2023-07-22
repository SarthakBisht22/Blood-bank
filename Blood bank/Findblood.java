package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Findblood {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarth\\OneDrive\\Desktop\\Automation Testing\\Browser extension\\chromedriver.exe");
		Select s;
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);
		
		//Blood group
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboBlood-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]")).click();
		
		
		//select state
		s= new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboState")));
		s.selectByVisibleText("Goa");
		
		//select district
		s= new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_cboCity\"]")));
		s.selectByVisibleText("North Goa");
		
		//select Tehsil
		s= new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboTeh")));
		s.selectByVisibleText("Ponda");
		Thread.sleep(2000);
		
		//Find blood
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]")).click();
		
		//Take screenshot
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\sarth\\OneDrive\\Desktop\\Automation Testing\\Blood bank\\Find Blood.png"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
	    

		
		
		
				

		
	}

}
