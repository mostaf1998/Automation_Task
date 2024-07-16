package utilities;

import Pages.Placeorder_page;
import Pages.Signin_page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Placeorder extends TestBase  {

    private static String FirstName;
    private static String LastName;
    private static String Email ;
    private static String Password ;
    private static String ConfirmPassword ;

    private static String Company;

    private static String StreetAddress;

    private static String City ;

    private static String PostalCode;

    private static String PhoneNumber;









    @Test
    (priority = 3)
    public void selectOrder() throws InterruptedException {
        Signin_page M = new Signin_page(driver);
        Placeorder_page P = new Placeorder_page(driver);
        M.sign().click();
        FirstName  = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","FirstName");
        LastName= M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","LastName");
        Email  = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","Email");
        Password  = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","Password");
        ConfirmPassword = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","ConfirmPassword");
        StreetAddress = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","StreetAddress");
        City = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","City");
        PostalCode = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","PostalCode");
        PhoneNumber = M.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","PhoneNumber");
        M.firstName(FirstName);
        M.lastName(LastName);
        M.email(Email);
        M.password(Password);
        M.confirmPassword(ConfirmPassword);
        M.createAccount().click();
        P.New().click();
        P.Scroll();
        P.Selectorder().click();
        P.scrollCart();
        P.addCart().click();
        Thread.sleep(500);
        P.shopCart().click();
        P.scrollProceed();
        P.proceedtoCheckout().click();
        Thread.sleep(500);
        P.scrollShippingAdress();
        P.StreetAddress().sendKeys("11 Street Cairo");
        P.City().sendKeys("Cairo");
        Select select = new Select(P.State());
        select.selectByValue("10");
        P.scrollProceed();
        Thread.sleep(500);
        P.postalCode().sendKeys("123456789");
        P.phoneNumber().sendKeys("01060611594");
        P.shippingMethod().click();
        P.Next().click();
        Thread.sleep(2000);
        JavascriptExecutor k = (JavascriptExecutor)driver;
        k.executeScript("window.scroll(0,1400)");
        P.placeHolderClck().click();

        //Asssert
        String ExpectedResult = "Thank you for your purchase!";
        String ActualResult = P.messagePayment().getText();
        Assert.assertTrue(ExpectedResult.contains(ActualResult),"False");














    }
}
