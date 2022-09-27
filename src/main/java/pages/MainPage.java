package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static constants.GuestConstants.SEARCHTEXT_CONTROL;
import static constants.MainConstants.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public MainPage(){
        methods = new Methods();
    }
    public void controlMainPage()throws InterruptedException{
        assertTrue(methods.isElementVisible(SEARCHDROPDOWNCARD, 20));
        assertTrue(methods.isElementVisible(SEARCHTEXTBOX, 20));
        assertTrue(methods.isElementVisible(SEARCHTEXTBOXNEXT, 20));
        assertTrue(methods.isElementVisible(DROPDOWNBOOKS, 20));
        Thread.sleep(1000);
    }
    public void searchBoxClick()throws InterruptedException{
        methods.clickElement(SEARCHTEXTBOX);
        Thread.sleep(1000);
        methods.clickElement(DROPDOWNBOOKS);
        Thread.sleep(1000);
        WebElement text = driver.findElement(SEARCHTEXTBOX);
        text.sendKeys(SEARCHKEYWORD);
        System.out.println("Kelime girildi");
        methods.clickElement(SEARCHTEXTBOXNEXT);
        Thread.sleep(1000);
    }

}
