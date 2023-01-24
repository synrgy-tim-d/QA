package Android.Page;

import Android.androidMain;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends androidMain {
    @AndroidFindBy(id = "username_field_id")
    public MobileElement usernameField;

    @AndroidFindBy(id = "password_field_id")
    public MobileElement passwordField;

    @AndroidFindBy(id = "login_button_id")
    public MobileElement loginButton;

    @AndroidFindBy(id = "register_button_id")
    public MobileElement registerButton;


    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void clickRegister() {
        registerButton.click();
    }
}
