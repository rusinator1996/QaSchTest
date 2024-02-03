package Hw12Page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class CheckoutStepOnePage {

    public SelenideElement firstNameField = $("#first-name");
    public SelenideElement lastNameField = $("#last-name");
    public SelenideElement postalCodeField = $("#postal-code");
    public SelenideElement continueBtn = $("#continue");

    public void setFirstName(String first_name) {
        firstNameField.setValue(first_name);
    }
    public void setLastName(String last_name) {
        lastNameField.setValue(last_name);
    }
    public void setPostalCode(String postal_code) {
        postalCodeField.setValue(postal_code);
    }
    public void clickContinueBtn(){
        continueBtn.click();
    }
}