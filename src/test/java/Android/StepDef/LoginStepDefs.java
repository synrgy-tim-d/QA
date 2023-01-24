package Android.StepDef;

import Android.Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.enterUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.enterPassword(password);
    }

    @When("user click on login button")
    public void userClickOnLoginButton() {
        loginPage.clickLogin();
    }

    @When("user click on register button")
    public void userClickOnRegisterButton() {
        loginPage.clickRegister();
    }
}
