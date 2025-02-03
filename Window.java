package Handling_windows;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/india/s?k=india");
				
		String tab1=driver.getWindowHandle();
		System.out.println("Tab 1 name : " +tab1);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		String tab2 = driver.getWindowHandle();
		System.out.println("Tab 2 name : " +tab2);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.canva.com/en_in/");
		String tab3 = driver.getWindowHandle();
		System.out.println("Tab 3 name : " +tab3);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.canva.com/en_in/");
		String tab4 = driver.getWindowHandle();
		System.out.println("Tab 4 name : " +tab4);   
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://letcode.in/frame");
		String tab5 = driver.getWindowHandle();
		System.out.println("Tab 5 name : " +tab5);
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://letcode.in/alert");
		String tab6 = driver.getWindowHandle();
		System.out.println("Tab 6 name : " +tab6);
		
		Thread.sleep(2000);
		
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> iterator = tabs.iterator();
		while(iterator.hasNext()) {
			driver.switchTo().window(iterator.next());
			Thread.sleep(2000);
		}
		
		driver.switchTo().window(tab1);
		driver.close(); //amazon page closed
		Thread.sleep(2000);
		
		driver.switchTo().window(tab3);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
