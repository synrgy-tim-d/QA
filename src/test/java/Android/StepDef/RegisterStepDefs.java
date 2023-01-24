package Android.StepDef;

import Android.Page.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class RegisterStepDefs {
    RegisterPage registerPage = new RegisterPage();

    @And("user input fullname with {string}")
    public void userInputFullname(String fullname) {
        registerPage.enterFullname(fullname);
    }

    @And("user input phone with {string}")
    public void userInputPhone(String phone) {
        registerPage.enterPhone(phone);
    }

    @And("user input email with {string}")
    public void userInputEmail(String email) {
        registerPage.enterEmail(email);
    }

    @And("user input password with {string}")
    public void userInputPassword(String password) {
        registerPage.enterPassword(password);
    }

    @When("user click register button")
    public void userClickRegisterButton(){
        registerPage.clickRegister();
    }
}
