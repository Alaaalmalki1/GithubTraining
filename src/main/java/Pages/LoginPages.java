package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectPaths.HomeObjects.*;

public class LoginPages {

    private WebDriver driver;


    public LoginPages(WebDriver driver) {

        this.driver = driver;
    }

    public void openUrl() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://github.com/login");
    }

    public void Username() throws InterruptedException {
        WebElement usernameField = driver.findElement(LOGIN_FIELD);
        usernameField.sendKeys("*************");
        Thread.sleep(2000);
    }

    public void Password() throws InterruptedException {
        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.sendKeys("*************");
        Thread.sleep(2000);
    }

    public void LoginButton() throws InterruptedException {
        WebElement loginButton = driver.findElement(LOGIN_BUTTON);
        loginButton.click();
        Thread.sleep(2000);
    }


    public void choosePublic() throws InterruptedException {
        WebElement cpublic = driver.findElement(choosePublic);
        cpublic.click();
        Thread.sleep(2000);
    }

    public void NewRepo() {
        WebElement repo = driver.findElement(RepoCreate);
        repo.sendKeys("Software_TestingSDLC");
    }

    public void repoClick() {
        WebElement repoclick = driver.findElement(RepoClick);
        repoclick.click();
    }

    public void profileclick() {
        WebElement profile = driver.findElement(Profile);
        profile.click();
    }


    public void SignOut() throws InterruptedException {
        WebElement ClickSignout = driver.findElement(Signout);
        ClickSignout.click();
        Thread.sleep(2000);
    }
}
