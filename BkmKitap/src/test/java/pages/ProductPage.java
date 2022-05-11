package pages;

import methods.Methods;
import org.openqa.selenium.By;

public class ProductPage {
    Methods methods;
    public ProductPage(){
        methods = new Methods();
    }
    public void product(){
        methods.waitBySeconds(2);
        methods.scrollWithJavaScript(By.xpath("//div[@id='tab-vitrin-2277'][@class='col col-12']"));
        methods.waitBySeconds(4);
        methods.click(By.xpath("//div[@id='tab-vitrin-2044']//a[@class='all pos-a pos-top pos-right col-sm-12 pr pl p-top p-bottom mt']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".col.col-12.p-top.p-left.fIc>div[data-title=\"Can Yayınları\"]"));
        methods.waitBySeconds(2);
        methods.scrollWithJavaScript(By.cssSelector(".image-wrapper.fl.detailLink.productItem445856"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@id='1003-product-detail-uysal-kiz-445856']//img[@class='stImage']"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".btn.col-12.btn-small.text-center.text-semibold.text-upper"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".btn.btn-radius.btn-success.fr"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".btn.btn-big.col-12.text-center.text-upper.buyBtn"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//select[@id='is_company_active']//option[@value=0]"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='title'][@class='col col-12 required withHolder loadedPlace']"),"Evim");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//textarea[@id='address']"),"Kendi Adresinizi Yazınız");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//input[@id='post_code']"),"06105");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".col.col-12.city-select.required>option:nth-child(8)"));
        methods.waitBySeconds(2);
        methods.scrollWithJavaScript(By.cssSelector(".col.col-12.phone.required.withHolder.loadedPlace"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".col.col-12.town-select.required>option:nth-child(26)"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".col.col-12.district-select.required>option:nth-child(37)"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".btn.btn-radius.btn-success.btn-medium.btn-upper.col-12"));
        methods.waitBySeconds(2);



    }
}
