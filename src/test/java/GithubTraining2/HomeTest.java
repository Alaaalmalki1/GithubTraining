package GithubTraining2;

import Base.BaseClass;
import Pages.HomePages;
import io.qameta.allure.*;
import org.testng.annotations.Test;


public class HomeTest extends BaseClass {

    @Test
    @Epic("Skills flow")
    @Owner("Alaa")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify that user is able to view and navigate to skills")
    public void HomePageMethods() throws InterruptedException {
        HomePages homePages = new HomePages(driver);
        homePages.Cskills();
        Thread.sleep(4000);

    }
    @Test
    public void HomePageMethods1() throws InterruptedException {
        HomePages homePages = new HomePages(driver);
        homePages.Publish();
        homePages.MitC();
        homePages.ClickCode();
        homePages.Prequest();
        Thread.sleep(4000);

    }


}
