package teste.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
    private WebDriver driver;
    private final String URL_BASE = "https://www.google.com/";
    private final String DRIVER_PATH = "src/test/java/teste/resource/chromedriver.exe";

    private void init() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        // driver, navegador
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @Test
    public void searchGoogle(){
        init();
        // localiza campo
        WebElement input = driver.findElement(By.name("q"));
        // escreve no campo
        input.sendKeys("Arroz doce" + Keys.ENTER);
         // retorna o texto de um elemento
        String result = driver.findElement((By.id("result-stats"))).getText();
        // verifica se algo é verdadeiro
        assertTrue(result, result.contains("Aproximadamente"));
        driver.quit();
    }
}
