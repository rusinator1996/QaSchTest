package Hw12Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class CheckoutCompletePage {

    public SelenideElement pageBody = $("body");

    public void checkTextOnCompletePage() {
        pageBody.shouldHave(Condition.text("Thank you for your order!"));
    }

}
