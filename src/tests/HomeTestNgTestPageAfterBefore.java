package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomeTestNgTestPageAfterBefore extends TestNgTestPage { //наследует от базового//


    @Test
    public void openHomePage() throws InterruptedException {
        //homePage.waitUntilElementIsLoad();
       // homePage.getGoToEventButtonName();

        //driver.get("https://mish.sheygam.com/#/wellcome");
        //driver.manage().window().maximize();
        waitUntilElementIsLoaded(driver,By.xpath ( "//button[@class='mat-stroked-button']" ),20);//метод задержки добавляем везде меняя путь прибытия

       List<WebElement> topLinksList = driver.findElements ( By.cssSelector ( ".mat-button-wrapper .mat-button-wrapper" ) );
        System.out.println ( "Login:" + topLinksList.get ( 0 ).getText () );
        System.out.println ( "Create Account:" + topLinksList.get ( 1 ).getText () );
        WebElement goToEventsButton = driver.findElement (
                By.className ( "mat-stroked-button" ) );
        System.out.println ( "Text of button: " + goToEventsButton.getText () );
        //Проверка что тест прошел//метод Assert//

        Assert.assertTrue ( goToEventsButton.getText ().equals ( "Go to Event list"  ) );
       //Assert.assertEquals (  "Go to Event list",goToEventsButton ) );


        //в скобках надпись точная на кнопке//
        // equals этод метод сравнения//
        //таким образом мы можем проверить правильная ли надпись на кнопке//

    }

    @Test
    public void goToEventTest(){
        waitUntilElementIsLoaded(driver,By.xpath ( "//button[@class='mat-stroked-button']" ),20);

        List<WebElement> topLinksList = driver.findElements ( By.cssSelector ( ".mat-button-wrapper .mat-button-wrapper" ) );
        System.out.println ( "Login:" + topLinksList.get ( 0 ).getText () );
        System.out.println ( "Create Account:" + topLinksList.get ( 1 ).getText () );
        WebElement goToEventsButton = driver.findElement (
                By.className ( "mat-stroked-button" ) );
        System.out.println ( "Text of button: " + goToEventsButton.getText () );
        //комментируем когда создаем assert//

        goToEventsButton.click ();
        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Filters')]" ),20);
        //этот тест проверяет нажатие кнопки после первого теста который находит и проверяет правильность кнопки
        // проверяем кликом нажатие кнопки//ставим на элемент find event найти на странице уникальный элемент

        WebElement titlePage = driver.findElement ( By.xpath ( "//h1[@class='gorisontal-center']" ) );
        Assert.assertTrue ( titlePage.getText ().equals ( "Find event" ) );//методом сравнения смотрим есть ли эта кнопка//
        WebElement LoginButton = driver.findElement ( By.xpath ( "//span[contains(text(),'Login')]" ) );
        Assert.assertTrue ( LoginButton.getText ().equals ( "Login" ) ); //
    }


    }

