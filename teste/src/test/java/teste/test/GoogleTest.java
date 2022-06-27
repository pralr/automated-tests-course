package teste.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com/";
    private final String DRIVER_PATH = "src/test/java/teste/resource/chromedriver.exe";

    private void init() {
        System.setProperty("webdriver.chrome.drive", DRIVER_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @Test
    public void searchGoogle(){
        init();
    }
}
