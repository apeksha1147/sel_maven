package abc;
import java.util.concurrent.TimeUnit;
//--
import org.openqa.selenium.By;
//--
import org.openqa.selenium.WebDriver;
//--
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//--
import org.openqa.selenium.firefox.FirefoxDriver;
//--
import org.testng.Assert;
//--
import org.testng.annotations.AfterClass;
//--
import org.testng.annotations.BeforeClass;
//--
import org.testng.annotations.Test;

public class  NewTest{

    private WebDriver driver;
    

    @BeforeClass
    public void beforeClass() {
    	System.setProperty("webdriver.chrome.driver", "E:\\Gaurav_Selenium\\jar\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    /*@AfterClass
    public void afterClass() {
        driver.quit();
    }*/

    @Test
    public void verifySearchButton() {
    	
    	
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        

        driver.get("http://www.google.com");
        
        driver.findElement(By.name("q")).sendKeys("flipkart");
        driver.findElement(By.xpath("//*[@type='submit']")).click();
        

       
    }
}