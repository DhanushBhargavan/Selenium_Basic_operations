package Navigation_through_features;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate_urls {
public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//-------------------------------------------------------------------------------------------------------		
		//get current page url
		String Fruitsurl = driver.getCurrentUrl();
		System.out.println("Fruits page URL : " +Fruitsurl);
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.bigbasket.com/pc/fruits-vegetables/exotic-fruits-veggies/");
		String Fruitsurl1 = driver.getCurrentUrl();
		System.out.println("Fruitsurl1 :" +Fruitsurl1);
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(3000);
//---------------------------------------------------------------------------------------------------------		
		driver.navigate().to("https://www.bigbasket.com/pc/beverages/tea/");
		String Teaurl = driver.getCurrentUrl();
		System.out.println("Teaurl :" +Teaurl);
		Thread.sleep(2000);
//		
		driver.navigate().forward();
		Thread.sleep(2000);
//-----------------------------------------------------------------------------------------------------------------------
		driver.navigate().to("https://www.bigbasket.com/pc/foodgrains-oil-masala/edible-oils-ghee/ghee-vanaspati/");
		String Gheeurl = driver.getCurrentUrl();
		System.out.println("Gheeurl :" +Gheeurl);
		Thread.sleep(2000);
		
		
		driver.navigate().forward(); // navigating to next page 
		Thread.sleep(2000);
//------------------------------------------------------------------------------------------------------------------------		
		driver.navigate().to("https://www.bigbasket.com/pb/nandini/"); 
		String Nandiniurl = driver.getCurrentUrl();
		System.out.println("Gheeurl :" +Nandiniurl);
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().back(); // for navigating back to previous page
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
	}

}
