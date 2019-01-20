package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class NegativeTestNgTestPageCreateAccountAndLoginAccount extends TestNgTestPage {
@Test
    public void  CreateNewAccountHome() {
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]" ),20);


        WebElement createAccount = driver.findElement( By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
       String email = latinDigitString (12)+"@gmail.com";
        WebElement mailField = driver.findElement( By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(email);


        WebElement passwordField = driver.findElement( By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("123");

    WebElement repPasswordField = driver.findElement( By.xpath("//input[@formcontrolname='passwordRep']"));
    repPasswordField.click();
    repPasswordField.sendKeys("123");


   // waitUntilElementIsLoaded(driver,By.className ( "mat-error ng-star-inserted"),20);

  // WebElement error =driver.findElement ( By.className ( "mat-error ng-star-inserted" ) ); //mat-error[@id='mat-error-14']
  //  Assert.assertTrue(error.getText()
            // .equals("Enter 6 characters"));
    WebElement cancel = driver.findElement( By.xpath ("//span[contains(text(),'Cancel')]"));
cancel.click ();

    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Go to Event list')]"),20);
    Assert.assertTrue(cancel.getText()
             .equals("Cancel"));

    }
    @Test
    public void CreateNewAccountAndLogInHome() {

        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),20);
        WebElement createAccount = driver.findElement( By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
        String email = latinDigitString (25)+"@gmail.com";
        waitUntilElementIsLoaded(driver,By.xpath ( "//input[@formcontrolname='email']"),20);
        WebElement mailField = driver.findElement( By.xpath("//input[@placeholder='Email']"));
        mailField.click();
        mailField.sendKeys(email);


        WebElement passwordField = driver.findElement( By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("123456");

        WebElement repPasswordField = driver.findElement( By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("123456");

        WebElement registrationButton = driver.findElement( By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//button[@type='button']//span[contains(text(),'Cancel')]/.."),50);

        WebElement cancelButton = driver
                .findElement( By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//mat-icon[@class='but mat-icon material-icons']"),35);
        WebElement menuButton = driver.findElement( By.xpath("//mat-icon[@class='but mat-icon material-icons']"));
        //menuButton = driver.findElement(By.cssSelector('mat-icon.but.mat-icon'));
        menuButton.click();

        WebElement logOutMenu = driver.findElement( By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Login')]"),20);

        //----------Login created user----------

        WebElement login = driver.findElement( By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement( By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys(email);
        waitUntilElementIsLoaded(driver,By.xpath ( "//input[@formcontrolname='password']"),20);

        WebElement passReg =  driver.findElement( By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("566788");
        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Log in')]"),35);
        WebElement log_In = driver.findElement( By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//div[@class='alert alert-danger ng-star-inserted']"),35);

        WebElement negativeLogin=  driver.findElement( By.xpath("//div[@class='alert alert-danger ng-star-inserted']"));

       Assert.assertTrue(negativeLogin.getText()
               .equals("Wrong authorization, login or password"));//
        Assert.assertTrue(passReg.getAttribute ("formcontrolname")
              .equals("password"));
        Assert.assertTrue(login.getText()
                .equals("Login"));
    }


    }





