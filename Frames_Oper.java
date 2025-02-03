package Handling_frames;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class Frames_Oper {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)", "");
		
		
//		driver.switchTo().frame(0); //by frame index method
//		driver.switchTo().frame("myframe"); // by directly giving id.
		WebElement myframe=driver.findElement(By.id("firstFr"));   // by id main way or the 1st way.
		driver.switchTo().frame(myframe);
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("jolly");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("reddy");
		Thread.sleep(2000);
		
		
		WebElement myframe1=driver.findElement(By.xpath("//iframe[@class='has-background-white']")); // click on inspect just on a 
		//blank frame. iframe and copy an attributr. its a inner frame.
		driver.switchTo().frame(myframe1);
		driver.findElement(By.name("email")).sendKeys("jolly@gmail.com");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent(); // the main page
		
		driver.findElement(By.xpath("//a[normalize-space()='Watch tutorial']")).click(); // You can also use normalize-space() 
		//on attribute values, though this is less common. If you expect the attribute value to have inconsistent spaces, you  
		//can apply normalize-space() to the attribute content as well.
		
		
		Thread.sleep(2000);
		
		driver.quit();	
	}
}
