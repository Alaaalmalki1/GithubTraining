package Pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectPaths.HomePaths.*;

public class HomePages {

    private WebDriver driver;

    public HomePages(WebDriver driver) {
        this.driver = driver;
    }

    public void Cskills() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement skills = driver.findElement(Skills);
        js.executeScript("window.scrollBy(0, 10000);");
        skills.click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, 10000);");
        Thread.sleep(2000);
    }

    public void Publish() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement publish = driver.findElement(Publish);
        js.executeScript("window.scrollBy(0, 80);");
        publish.click();
        js.executeScript("window.scrollBy(0, 80);");
        Thread.sleep(2000);
    }

    public void MitC() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Mit = driver.findElement(MitC);
        js.executeScript("window.scrollBy(0, 300);");
        Mit.click();
        js.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(2000);
    }


    public void ClickCode() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement code = driver.findElement(Clickcode);
        js.executeScript("window.scrollBy(0, 80);");
        code.click();
        js.executeScript("window.scrollBy(0, 80);");
        Thread.sleep(2000);
    }
    public void Prequest() throws InterruptedException {
        WebElement Pullrequest = driver.findElement(Prequest);
        Pullrequest.click();
        Thread.sleep(2000);
    }
}
