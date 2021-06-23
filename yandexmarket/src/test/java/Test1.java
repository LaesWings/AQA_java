import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Test1 {
    System.setProperty("webdriver.chrome.driver", "Z:chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        @Test
        public void simpleTest() {
            driver.get("https://market.yandex.ru");
        }


}
