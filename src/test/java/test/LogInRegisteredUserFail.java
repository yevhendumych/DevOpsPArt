package test;

import tools.TestRunner;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.YourAccount;


public class LogInRegisteredUserFail extends TestRunner {

    @Description("Only to take a screenshoot")
    @Test
    public void checkCreaing(){
        //Arrange
        LoginPage login_page = new LoginPage(driver);
        String eMail = "iggi@gmail.com";
        java.lang.String password = "qwerty";
        boolean expected;

        //Act
        login_page.clickSignInButton();
        login_page.setEmailFIeld(eMail);
        login_page.setPasswordField(password);
        login_page.clickLoginButton();

        //Assert
        java.lang.String actual = driver.getCurrentUrl();
        expected = actual.contains("my-account12");
        Assert.assertTrue(expected);
        YourAccount myAccount = new YourAccount(driver);
        myAccount.clickLogOutButton();


    }

}
