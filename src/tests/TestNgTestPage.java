package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.Random;

//класс который родитель методов//сборник методов//

public class TestNgTestPage {
      public WebDriver driver;

    @BeforeMethod//@BeforeSuite//only first
    //запускает этот метод перед каждым тестом в основном классе
   public void initWebDriver(){
        driver = new ChromeDriver ();
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }
    @AfterMethod//после всех тестов выполняется этот методб=указывает на место где запускать//
    public void  tearDown(){
        driver.quit ();
    }

    public void waitUntilElementIsLoaded(WebDriver driver, By Locator, int time) {
        try {
            //определяет прогрузился ли элемент нужного локатора, замена задержкию максимальное время параметр тайм
            //(можно завязаться по локатору в случае списка элементов в локатореюпросто по локаторую после кликаю когда исчезнет
            new WebDriverWait ( driver, time ).until ( ExpectedConditions.presenceOfElementLocated ( Locator ) );

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
    public static String latinDigitString(int length){
        String str = "";
        //char ch;
        int number;
        Random gen = new Random ();
        //int i = 0;
        do {
            number = '0' + gen.nextInt('z' - '0' +1);
            if ((number <= '9') || (number >= 'A' && number <= 'Z') || (number >= 'a'))
            {
                str = str + (char)number;
            }
        }while(str.length()<length);
        return str;
    }

}