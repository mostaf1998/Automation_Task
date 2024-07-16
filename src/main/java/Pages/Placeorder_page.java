package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Placeorder_page {
    WebDriver driver;
    public Placeorder_page(WebDriver x)
    {
        this.driver = x;
    }
    public WebElement New() {
        return driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/span"));
    }

    public void Scroll()
    {
        JavascriptExecutor n = (JavascriptExecutor)driver;
        n.executeScript("window.scroll(0,1400)");
    }
    public WebElement Selectorder() {
        return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[1]/div[1]/div[3]/div/div/ol/li[1]/div/div/strong/a"));
    }
    public void scrollCart()
    {
        JavascriptExecutor n = (JavascriptExecutor)driver;
        n.executeScript("window.scroll(0,450)");
    }
    public WebElement addCart() {
        return driver.findElement(By.id("product-addtocart-button"));
    }
    public WebElement shopCart() {
        return driver.findElement(By.linkText("shopping cart"));
    }

    public void scrollProceed()
    {
        JavascriptExecutor n = (JavascriptExecutor)driver;
        n.executeScript("window.scroll(0,500)");
    }

    public WebElement proceedtoCheckout() {
        return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button"));
    }
    public void scrollShippingAdress()
    {
        JavascriptExecutor n = (JavascriptExecutor)driver;
        n.executeScript("window.scroll(0,650)");
    }

    public WebElement StreetAddress() {
        return driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input"));
    }
    public WebElement City() {
       return driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/input"));
    }
    public WebElement State() {
        return driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[5]/div/select"));
    }
    public WebElement postalCode() {
        return driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input"));
    }
    public WebElement phoneNumber() {
        return driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/input"));
    }
    public WebElement shippingMethod() {
        return driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input"));
    }
    public WebElement Next() {
        return driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button"));
    }
    public WebElement placeHolderClck() {
        return driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/div[2]/div[4]/ol/li[3]/div/form/fieldset/div[1]/div/div/div[2]/div[2]/div[4]/div/button/span"));
    }
    public WebElement messagePayment () {
        return driver.findElement(By.xpath("/html/body/div[2]/main/div[1]/h1/span"));
    }

}
