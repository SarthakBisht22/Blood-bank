package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class bloodbank {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarth\\OneDrive\\Desktop\\Automation Testing\\Browser extension\\chromedriver.exe");
		Select s;
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);
		
		//click on blood bank 
		driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		
		//scroll
				JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//scroll till search
		WebElement w=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSave\"]"));
		js.executeScript("arguments[0].scrollIntoView();",w);
		
		//select state
		s= new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboState")));
		s.selectByVisibleText("Goa");
		
		
		//Select district
		s= new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_cboCity")));
		s.selectByVisibleText("North Goa");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, 0);");
		
		
		//click on search
		w.click();
		
		

				
		//Take screenshot
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(f,new File("C:\\Users\\sarth\\OneDrive\\Desktop\\Automation Testing\\Blood bank\\ bloodbanksearch.png"));
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
