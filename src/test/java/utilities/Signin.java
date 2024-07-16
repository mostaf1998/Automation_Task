package utilities;

import Pages.Signin_page;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Signin extends TestBase{
    Signin_page s ;
    private static String FirstName;
    private static String LastName;
    private static String Email ;
    private static String Password ;
    private static String ConfirmPassword ;




    @Test
    (priority = 1)
    public void Sign()
    {
         s = new Signin_page(driver);
         s.sign().click();


    }

     @Test
     (priority = 2)
    public void signInfo()
     {
      s = new Signin_page(driver);
      Sign();
      FirstName  = s.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","FirstName");
      LastName= s.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","LastName");
      Email  = s.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","Email");
      Password  = s.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","Password");
      ConfirmPassword = s.getData(System.getProperty("user.dir")+"/src/main/resources/TestData/signdata.json","ConfirmPassword");
      s.firstName(FirstName);
      s.lastName(LastName);
      s.email(Email);
      s.password(Password);
      s.confirmPassword(ConfirmPassword);
      s.createAccount().click();
      String ExpectedResult = "Thank you for registering with Main Website Store. ";
      String ActualResult = s.message().getText();
      System.out.println(ActualResult);
      Assert.assertTrue(ExpectedResult.contains(ActualResult),"True");

     }




}
