package Hw12Page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public SelenideElement userNameField = $("#user-name");
    public SelenideElement passwordField = $("#password");
    public SelenideElement loginButton = $("#login-button");


    public void setLogin(String username) {
        userNameField.setValue(username);
    }
    public void setPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickLoginButton(){
        loginButton.click();
    }
}
