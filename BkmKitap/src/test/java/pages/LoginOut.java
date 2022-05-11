package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class LoginOut {
    Methods methods;
    public LoginOut() {
        methods = new Methods();
    }
    public void logOut(){
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".fr.box.col-6.text-center.text-upper"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".logout.btn.col-12.btn-medium"));
        methods.waitBySeconds(2);
    }
}
