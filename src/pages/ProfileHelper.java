package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProfileHelper extends Base {
    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    WebElement cancelButton;
    @FindBy(xpath = "//mat-icon[@mattooltip='Menu']")
    WebElement iconButton;
    @FindBy(xpath = "//h1[@class='classCentr']")  //заголовок кнопки регистрации cтраницы регистрации профиля
            WebElement header;

    public ProfileHelper(WebDriver driver) {
        super(driver);
    }

    public ProfileHelper waitUntilPageLoad(){
        waitUntilElementIsLoaded(driver, cancelButton, 40);
        waitUntilElementIsLoaded(driver, iconButton, 40);
        waitUntilElementIsLoaded(driver, header,10);
        System.out.println("Cancel button: "+ cancelButton.getText());
        return this;
    }

    public ProfileHelper menuButtonClick(){
        iconButton.click();
        return this;
    }


    public String getHeader() {
        return header.getText();//гет текст через файнд элемент печатает надпись на этом элементе

    }

}
