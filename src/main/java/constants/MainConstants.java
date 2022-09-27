package constants;

import org.openqa.selenium.By;

public class MainConstants {
    public static final String  SEARCHKEYWORD="Jose Mauro de Vasconcelos";

    public static final By SEARCHDROPDOWNCARD = By.cssSelector("div[id=\"nav-search-dropdown-card\"]");
    public static final By SEARCHTEXTBOX = By.cssSelector("input[id=\"twotabsearchtextbox\"]");
    public static final By SEARCHTEXTBOXNEXT = By.cssSelector("input[id=\"nav-search-submit-button\"]");
    public static final By DROPDOWNBOOKS = By.cssSelector("option[value=\"search-alias=stripbooks\"]");
}
