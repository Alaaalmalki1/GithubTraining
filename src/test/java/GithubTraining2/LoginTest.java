package GithubTraining2;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {

    @Test
    public void LoginPageMethod() throws InterruptedException {
        LoginPages Loginin = new LoginPages(driver);
        Loginin.openUrl();
        Loginin.Username();
        Loginin.Password();
        Loginin.LoginButton();

    }
    @Test
    public void LoginPageMethod1() throws InterruptedException {

        LoginPages Loginin1 = new LoginPages(driver);
        Loginin1.NewRepo();
        Loginin1.choosePublic();
        Thread.sleep(3000);
        Loginin1.repoClick();
        Thread.sleep(3000);
        Loginin1.profileclick();
        Thread.sleep(3000);
        Loginin1.SignOut();
        Thread.sleep(3000);
        }
}
