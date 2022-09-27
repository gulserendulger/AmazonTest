package constants;

import org.openqa.selenium.By;

public class LoginConstants {
    public static final String  EMAIL="gulserentestinium@gmail.com";
    public static final String  PASSWORD="Test1234.";

    public static final By CONTINUEBUTTON = By.cssSelector("input[id=\"continue\"]");
    public static final By EMAİLTEXT = By.cssSelector("input[id=\"ap_email\"]");
    public static final By PASSWORDTEXT = By.cssSelector("input[id=\"ap_password\"]");
    public static final By SIGNINBUTTON = By.cssSelector("input[id=\"signInSubmit\"]");
}
