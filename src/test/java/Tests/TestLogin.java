package Tests;


import Pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class TestLogin extends BaseTest {

    @Test
    public void testLogin(){
        String url= "https://www.saucedemo.com";
        driver.get(url);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("anushkagoldi99@gmail.com", "Goldi@123");
    }
}
