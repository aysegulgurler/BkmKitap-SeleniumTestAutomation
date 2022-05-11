package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class LoginPage {
    Methods methods;
    public  LoginPage(){
        methods = new Methods();
    }
    public void login(){
        methods.waitBySeconds(2);
        methods.click(By.id("img_lightbox_close_71_4"));
        methods.waitBySeconds(2);
        methods.click(By.id("login"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.name("ug-email"),"mailinizi yazınız");
        methods.waitBySeconds(1);
        methods.sendKeys(By.name("ug-password"),"şifrenizi yazınız");
        methods.waitBySeconds(1);
        methods.click(By.id("member-login-btn"));
        methods.waitBySeconds(2);


    }
}
