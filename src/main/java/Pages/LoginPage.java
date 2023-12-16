package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By UserName= By.id("user-name");
    private By Password= By.id("password");
    private By LoginBtn= By.id("login-button");

    public void login(String username, String password){
        driver.findElement(UserName).sendKeys(username);
        driver.findElement(Password).sendKeys(password);
        driver.findElement(LoginBtn).click();
    }
}
