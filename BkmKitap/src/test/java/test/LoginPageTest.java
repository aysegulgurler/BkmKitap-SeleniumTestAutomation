package test;

import driver.BaseTest;
import org.junit.Test;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void loginPage(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();



    }
}
