package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world");
        System.setProperty("webdriver.chrome.driver", "C://Users//Anthony//Documents//chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://apprater.net/add/");
        driver.findElement(By.name("user-submitted-name")).sendKeys("Lucas Ocampo");
        driver.findElement(By.name("user-submitted-email")).sendKeys("luisocampo@hotmail.com");
        driver.findElement(By.name("user-submitted-title")).sendKeys("Doña pepa");
        driver.findElement(By.name("user-submitted-url[]")).sendKeys("https://www.doñapepa.com");
        driver.findElement(By.name("user-submitted-content")).sendKeys("Doña pepa es un chocolate que no te puedes resistir");
        //Se usaría la función dada pero para ser mas visual se usara lor métodos dentro de driver
    }
}
