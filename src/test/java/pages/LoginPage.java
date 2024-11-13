package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement userName;

    @FindBy(id = "password")
    private WebElement userPassword;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage() {
        driver.get("https://www.saucedemo.com/");
        PageFactory.initElements(driver, this);
    }

    public LoginPage loginOnSite(String username, String password) {
        userName.sendKeys(username);
        userPassword.sendKeys(password);
        loginButton.click();
        return this;
    }
}
