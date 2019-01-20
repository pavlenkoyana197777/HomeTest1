package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestNgTestPageCreateAccountAndLoginAccount extends TestNgTestPage {
@Test
    public void  CreateNewAccountHome()  {
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]" ),20);


        WebElement createAccount = driver.findElement( By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
        //!!// email
    String email = latinDigitString (8)+"@gmail.com";//метод случайной генерации емайл.В каждом классе использования повторить

        WebElement mailField = driver.findElement( By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys(email);


        WebElement passwordField = driver.findElement( By.xpath("//input[@formcontrolname='password']"));
    Assert.assertTrue(passwordField.getAttribute ("formcontrolname")
            .equals("password"));

            passwordField.click();
        passwordField.sendKeys("123456");

        WebElement repPasswordField = driver.findElement( By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),20);

        repPasswordField.sendKeys("123456");

        WebElement registrationButton = driver.findElement( By.xpath("//span[contains(text(),'Registration')]"));//span[contains(text(),'Registration')]
    Assert.assertTrue(registrationButton.getText()
            .equals("Registration"));
        registrationButton.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),20);

        WebElement cancelButton = driver
                .findElement( By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//mat-icon[@mattooltip='Menu']"),20);

        WebElement menuButton = driver.findElement( By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        WebElement logOutMenu = driver.findElement( By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Login')]"),20);





    }
    @Test
    public void CreateNewAccountAndLogInHome() {

        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),20);
        WebElement createAccount = driver.findElement( By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
        String email = latinDigitString (8)+"@gmail.com";
        WebElement mailField = driver.findElement( By.xpath("//input[@formcontrolname='email']"));
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
        waitUntilElementIsLoaded(driver,By.xpath
                ( "//button[@type='button']//span[contains(text(),'Cancel')]/.."),20);

        WebElement cancelButton = driver
                .findElement( By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
        waitUntilElementIsLoaded(driver,By.xpath
                ( "//mat-icon[@mattooltip='Menu']"),20);
        WebElement menuButton = driver.findElement( By.xpath("//mat-icon[@mattooltip='Menu']"));
        //it is menuButton page Event

        menuButton.click();

        WebElement logOutMenu = driver.findElement( By
                .xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver,By
                .xpath ( "//span[contains(text(),'Login')]"),20);

        //----------Login created user----------

        WebElement login = driver.findElement( By
                .xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement( By
                .xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys(email);
        waitUntilElementIsLoaded(driver,By.xpath ( "//input[@formcontrolname='password']"),20);

        WebElement passReg =  driver.findElement( By
                .xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("123456");
        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Log in')]"),20);
        WebElement log_In = driver.findElement( By
                .xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//h1[@class='classCentr']"),20);


        WebElement registration =  driver.findElement( By
                .xpath("//h1[@class='classCentr']"));
        Assert.assertTrue (registration.getText ().equals ( "Registration" )  );
        WebElement changeAvatar  =driver.findElement ( By
                .xpath ( "//h5[contains(text(),'Change avatar')] ") ) ;
        Assert.assertTrue ( changeAvatar.getText ().equals (  "Change avatar") );
        WebElement menuButtonRegist = driver.findElement( By
                .xpath("//mat-icon[@class='but mat-icon material-icons']"));
        //button menu difference it is page registration
        menuButtonRegist.click();
        WebElement logOutMenuRegist = driver.findElement( By.xpath ("//div[@class='insideDiv']//button[7]"));
        logOutMenuRegist.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),45);
        //в тесте регистрации лог ин мы не жмем на выход с поля регистрации а сразу идем в меню, кнопки
        // меню и лог аут в данном случае разные

    }
}




