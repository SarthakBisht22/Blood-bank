package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blog {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sarth\\OneDrive\\Desktop\\Automation Testing\\Browser extension\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://bloodbanktoday.com/");
		Thread.sleep(2000);
		
		//Click on Blogs
		driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[3]/a")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		
		//click on read more
		driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_UpdatePanel1\"]/div/div/div[1]/div[1]/div/div[3]/div/div/a")).click();
		Thread.sleep(2000);
		//scroll till bottom
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		
		//back to home
		js.executeScript("window.scrollTo(0, 0);");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"aspnetForm\"]/header/div[2]/div/div/nav/div[2]/ul/li[1]/a")).click();
		
		driver.quit();
		

         
	}

}
