package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//то с чем мы работаем//
public class CreateNewAccountHome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver ();
        driver.get ( "https://mish.sheygam.com/#/wellcome" );
        driver.manage ().window ().maximize ();
        Thread.sleep ( 10000 );

        WebElement createAccount = driver.findElement ( By.xpath ( "//span[contains(text(),'Create Account')]" ) );
        createAccount.click ();

        WebElement mailField = driver.findElement ( By.xpath ( "//input[@formcontrolname='email']" ) );
        mailField.click ();
        mailField.sendKeys ( "yanina102@gmail.com" );


        WebElement passwordField = driver.findElement ( By.xpath ( "//input[@formcontrolname='password']" ) );
        passwordField.click ();
        passwordField.sendKeys ( "123456" );

        WebElement repPasswordField = driver.findElement ( By.xpath ( "//input[@formcontrolname='passwordRep']" ) );
        repPasswordField.click ();
        Thread.sleep ( 5000 );

        repPasswordField.sendKeys ( "123456" );

        WebElement registrationButton = driver.findElement ( By.xpath ( "//span[contains(text(),'Registration')]" ) );
        registrationButton.click ();
        Thread.sleep ( 15000 );

        WebElement cancelButton = driver
                .findElement ( By.xpath ( "//button[@type='button']//span[contains(text(),'Cancel')]/.." ) );

        cancelButton.click ();
        Thread.sleep ( 7000 );

        WebElement menuButton = driver.findElement ( By.xpath ( "//mat-icon[@mattooltip='Menu']" ) );
        menuButton.click ();

        WebElement logOutMenu = driver.findElement ( By.xpath ( "//span[@class='marginLeft']" ) );
        logOutMenu.click ();
        Thread.sleep ( 3000 );
        driver.quit ();

    }
}
