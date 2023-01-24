package Android.Page;
import Android.androidMain;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterPage extends androidMain {
    @AndroidFindBy(id = "fullname_field_id")
    public MobileElement fullnameField;

    @AndroidFindBy(id = "phone_field_id")
    public MobileElement phoneField;

    @AndroidFindBy(id = "email_field_id")
    public MobileElement emailField;

    @AndroidFindBy(id = "password_field_id")
    public MobileElement passwordField;

    @AndroidFindBy(id = "register_button_id")
    public MobileElement registerButton;

    public void enterFullname(String fullname){
        fullnameField.sendKeys(fullname);
    }

    public void enterPhone(String phone){
        phoneField.sendKeys(phone);
    }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickRegister(){
        registerButton.click();
    }
}
