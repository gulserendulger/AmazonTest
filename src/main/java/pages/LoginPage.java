package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static constants.LoginConstants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public LoginPage(){methods = new Methods();}
    public void controlEmailPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(EMAİLTEXT, 20));
        Thread.sleep(1000);
        assertTrue(methods.isElementVisible(CONTINUEBUTTON,20));
        Thread.sleep(1000);
    }
    public void clickContinueButton() throws InterruptedException {
        WebElement sendText = driver.findElement(EMAİLTEXT);
        sendText.sendKeys(EMAIL);
        methods.clickElement(CONTINUEBUTTON);
        Thread.sleep(1000);
    }
    public void controlPasswordPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(PASSWORDTEXT, 20));
        Thread.sleep(1000);
        assertTrue(methods.isElementVisible(SIGNINBUTTON,20));
        Thread.sleep(1000);
    }
    public void clickSigninButton() throws InterruptedException {
        WebElement sendText = driver.findElement(PASSWORDTEXT);
        sendText.sendKeys(PASSWORD);
        methods.clickElement(SIGNINBUTTON);
        Thread.sleep(1000);
    }
}
