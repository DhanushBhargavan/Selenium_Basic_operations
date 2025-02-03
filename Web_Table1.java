package Handling_Web_Tables;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Table1 {
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://letcode.in/table");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)", "");
        Thread.sleep(2000);

        WebElement table = driver.findElement(By.id("simpletable"));
        
        // Print table headers
        List<WebElement> headers = table.findElements(By.tagName("th"));
        for (WebElement header : headers) {
            System.out.print(header.getText() + "\t");
        }
        System.out.println();

        // Print table rows and columns
        List<WebElement> allrows = table.findElements(By.cssSelector("tbody tr"));
        int size = allrows.size();
        System.out.println("Rows size :" + size);
        Thread.sleep(2000);

        for (WebElement row : allrows) {
            List<WebElement> columns = row.findElements(By.tagName("td"));
            for (WebElement column : columns) {
                System.out.print(column.getText() + "\t"); // Print all columns
            }
            System.out.println();  // Move to the next line after each row
        }

    }
}
