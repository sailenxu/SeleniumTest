import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainActivity {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\project\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com");
        System.out.println("ok");
        Thread.sleep(2000);
//        driver.findElement(By.id("kw")).sendKeys("selenium");
        //ʹ��jsע��������������input
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('kw').value=selenium");
        Thread.sleep(5000);
        driver.findElement(By.id("su")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
