package Pages;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Signin_page {
    WebDriver driver;

    public Signin_page(WebDriver x)
    {
      this.driver = x;
    }

    public WebElement sign() {
        return driver.findElement(By.linkText("Create an Account"));
    }
    public void firstName (String name) {
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(name);
    }
    public void lastName(String name) {
        driver.findElement(By.id("lastname")).sendKeys(name);

        }
    public void email(String Email) {
         driver.findElement(By.id("email_address")).sendKeys(Email);
    }
    public void  password(String pass) {
         driver.findElement(By.id("password")).sendKeys(pass);
    }
    public void confirmPassword(String Confirmpass) {
         driver.findElement(By.id("password-confirmation")).sendKeys(Confirmpass);
    }
    public WebElement createAccount() {
        return driver.findElement(By.xpath("//button[@title=\"Create an Account\"]"));
    }
    public WebElement message() {
        return driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
    }

    // Read data from json file
    public static String getData(String jsonPath, String field) {
        try {
            //Define object of json parser
            JSONParser parser = new JSONParser();
            //Define object of file Reader
            FileReader reader = new FileReader(jsonPath);
            Object object = parser.parse(reader);

            JSONObject jsonOject = (JSONObject) object;

            return jsonOject.get(field).toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    }
