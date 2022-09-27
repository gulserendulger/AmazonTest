package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import static constants.GuestConstants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GuestPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public GuestPage(){methods = new Methods();}
    public void controlGuestPage() throws InterruptedException {
        assertTrue(methods.isElementVisible(ACCEPTCOOKIES, 20));
        assertTrue(methods.isElementVisible(LOGINBUTTON_CONTROL, 20));
        assertTrue(methods.isElementVisible(LOGO_CONTROL, 20));
        assertTrue(methods.isElementVisible(SEARCHTEXT_CONTROL, 20));
        Thread.sleep(1000);
    }
    public void clickLoginButton()throws InterruptedException{
        WebElement AcceptCookiesClick = driver.findElement(ACCEPTCOOKIES);
        Thread.sleep(1000);
        actions.moveToElement(AcceptCookiesClick).click().perform();
        System.out.println("Accept cookies tıklandı");
        Thread.sleep(2000);
        WebElement LoginClick = driver.findElement(LOGINBUTTON_CONTROL);
        Thread.sleep(1000);
        actions.moveToElement(LoginClick).click().perform();
        System.out.println("Login tıklandı");
        Thread.sleep(1000);
    }
}
