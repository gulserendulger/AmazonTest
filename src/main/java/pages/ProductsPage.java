package pages;

import driver.Driver;
import methods.Methods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import java.util.Random;
import static constants.ProductsConstanst.*;

public class ProductsPage extends Driver {
    Actions actions=new Actions(driver);
    Methods methods;
    public ProductsPage(){
        methods = new Methods();
    }
    public void selectProducts()throws InterruptedException{
        List<WebElement> products= driver.findElements(PRODUCTS);
        int maxProducts = products.size();
        System.out.println(maxProducts);
        Random random = new Random();
        int randomProduct = random.nextInt(maxProducts);
        products.get(randomProduct).click();
        System.out.println("ürüne tıklandı");
        Thread.sleep(1000);
    }
    public void addToCartButton()throws InterruptedException{;
        methods.clickElement(ADDTOCARTBUTTON);
        Thread.sleep(1000);
        System.out.println("Ürün sepete eklendi");
        methods.clickElement(CART);
        Thread.sleep(1000);
        System.out.println("alışveriş sepetine tıklandı");
    }

    public void deleteProducts()throws InterruptedException {
        WebElement Delete=driver.findElement(DELETE);
        actions.doubleClick(Delete).perform();
        Thread.sleep(5000);
        driver.navigate().refresh();
    }
}
