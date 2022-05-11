package test;

import driver.BaseTest;
import org.junit.Test;
import pages.ProductPage;

public class ProductPageTest extends BaseTest {
    @Test
    public void productPage(){
        ProductPage productPage = new ProductPage();
        productPage.product();
    }
}
