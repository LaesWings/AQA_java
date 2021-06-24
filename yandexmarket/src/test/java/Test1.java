import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    //System.setProperty("webdriver.chrome.driver", "Z:chromedriver.exe");
    WebDriver driver;

        @BeforeMethod
        public void setTest() {
            this.driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        }

        @Test
    public void simpleTest(){
            driver.get("https://market.yandex.ru");

        }

        @AfterMethod
    public void quitTest(){
        driver.quit();
        }
}
