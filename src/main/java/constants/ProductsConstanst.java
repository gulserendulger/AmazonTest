package constants;

import org.openqa.selenium.By;

public class ProductsConstanst {
    public static final By PRODUCTS = By.cssSelector("span[class=\"a-size-medium a-color-base a-text-normal\"]");
    public static final By ADDTOCARTBUTTON = By.cssSelector("input[id=\"add-to-cart-button\"]");
    public static final By CART = By.cssSelector("A[id=\"nav-cart\"]");
    public static  By DELETE = By.cssSelector("input[value=\"Sil\"]");
}
