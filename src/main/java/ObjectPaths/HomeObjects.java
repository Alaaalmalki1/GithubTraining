package ObjectPaths;

import org.openqa.selenium.By;

public class HomeObjects {
    public static final By LOGIN_FIELD = By.id("login_field");
    public static final By PASSWORD_FIELD = By.id("password");
    public static final By LOGIN_BUTTON = By.xpath("//input[@type='submit' and @value='Sign in']");
    public static final By choosePublic = By.xpath("/html/body//*[@id=\"dashboard\"]/div/feed-container/div[2]/article[1]/div/div[1]/section/form/div/div/fieldset/div/div[1]/span/label\n");
    public static final By RepoCreate = By.xpath("//input[@name='repository[name]']");
    public static final By RepoClick = By.xpath("//button[contains(., 'Create a new repository')]");
    public static final By Profile = By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[3]/deferred-side-panel/include-fragment/react-partial-anchor/button/span/span/img");
    public static final By Signout = By.xpath("//*[@id=\":r11:--label\"]");

}
