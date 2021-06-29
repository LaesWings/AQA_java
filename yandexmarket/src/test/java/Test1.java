import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test1 {
    //System.setProperty("webdriver.chrome.driver", "Z:chromedriver.exe");
    ChromeDriver driver;

    @BeforeMethod
    public void setTest() {
        this.driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void simpleTest() throws InterruptedException {
        driver.get("https://market.yandex.ru");
        //driver.get("http://www.google.com/");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text())])[1]/following::span[11]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text())])[1]/following::span[12]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text())])[1]/following::span[13]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(.//*[normalize-space(text())])[1]/following::span[15]")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.linkText("Холодильники")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₽'])[1]/following::span[2]")).click();
        // Thread.sleep(1000);
        // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Продолжить покупки'])[1]/following::span[1]")).click();
        // Thread.sleep(1000);
        // driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='₽'])[1]/following::*[name()='svg'][2]")).click();
        // Thread.sleep(1000);
        // driver.findElement(By.xpath("//a/div/span")).click();

        Thread.sleep(1000);

    }

    @AfterMethod
    public void quitTest() {

        driver.quit();
    }
}
