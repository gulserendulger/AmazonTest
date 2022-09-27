package org.example;

import driver.Driver;
import org.junit.jupiter.api.Test;
import pages.GuestPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductsPage;

public class AmazonTest extends Driver {
    GuestPage guestPage;
    LoginPage loginPage;
    MainPage mainPage;
    ProductsPage productsPage;

    @Test
    public void test() throws InterruptedException {
        init();
        guestPage.controlGuestPage();
        guestPage.clickLoginButton();
        loginPage.controlEmailPage();
        loginPage.clickContinueButton();
        loginPage.controlPasswordPage();
        loginPage.clickSigninButton();
        mainPage.controlMainPage();
        mainPage.searchBoxClick();
        productsPage.selectProducts();
        productsPage.addToCartButton();
        productsPage.deleteProducts();

    }
    public void init(){
        guestPage=new GuestPage();
        loginPage=new LoginPage();
        mainPage =new MainPage();
        productsPage=new ProductsPage();
    }

}
