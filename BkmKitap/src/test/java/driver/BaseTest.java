package driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginOut;
import pages.LoginPage;

public class BaseTest {
    public static WebDriver driver;
    LoginPage loginPage;
    LoginOut loginOut;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");//bildirimleri devre dışı bırak.
        chromeOptions.addArguments("--disable-gpu");//Tüm sayfalarda GPU birleştirmeyi devre dışı bırakmaktır. Devre dışı bırakılan GPU Chrome, web sayfasını oluşturmak için normal CPU işlemcinizi kullanır.
        chromeOptions.addArguments("--no-sandbox");//Sanal olarak çalışmasını engelliyor.
        chromeOptions.addArguments("disable-infobars");//Bilgi çubuklarını devredışı bırak.
        chromeOptions.addArguments("disable-plugins");//Eklentileri devre dışı bırak.
        chromeOptions.addArguments("disable-popup-blocking");//Pop-Up engelleyicileri devredışı bırak.
        chromeOptions.addArguments("ignore-certificate-errors");//Sertifika hatalarını yoksay.
        chromeOptions.addArguments("disable-translate");//Çeviriciyi devredışı bırak.
        chromeOptions.addArguments("disable-extensions");//Uzantıları devredışı bırak.

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        ChromeOptions merge = chromeOptions.merge(desiredCapabilities);//Tarayıcıya aktif ettiğin özellikleri uygular.

        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.get("https://www.bkmkitap.com/");

        LoginPage loginPage = new LoginPage();
        loginPage.login();
    }

    @After
    public void tearDown() {
        LoginOut loginOut = new LoginOut();
        loginOut.logOut();

        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }}
