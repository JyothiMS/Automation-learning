import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoth\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
    }
}
