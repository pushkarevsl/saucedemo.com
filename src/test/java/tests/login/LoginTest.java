package tests.login;

import core.BaseTest;
import helpers.Config;
import helpers.constants.URL;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.LoginPage;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    @Description("Проверка успешного логина с корректными учетными данными")
    public void testSuccessfulLogin() {
        LoginPage loginPage = new LoginPage();
        String login = Config.get("USERNAME");
        String password = Config.get("PASSWORD");

        loginPage.loginOnSite(login, password);

        assertTrue(Objects.requireNonNull(driver.getCurrentUrl()).contains(URL.INVENTORY));
        assertTrue(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText().contains("Products"));
    }
}