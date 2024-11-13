package tests.login;

import helpers.Config;
import pages.LoginPage;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

public class LoginTest {
    private LoginPage loginPage = new LoginPage();
    String login = Config.get("USERNAME");
    String password = Config.get("PASSWORD");

    @Test
    @Description("Проверка успешного логина с корректными учетными данными")
    public void testSuccessfulLogin() {

        loginPage.loginOnSite(login, password);




//        assertTrue(driver.getCurrentUrl().contains("inventory.html"));
//        assertTrue(driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span")).getText().contains("Products"));
    }

//    @Step("Выполнение логина с пользователем {userName}")
//    private void login(String userName, String password) {
//        loginPage.login(userName, password);
//    }
}

