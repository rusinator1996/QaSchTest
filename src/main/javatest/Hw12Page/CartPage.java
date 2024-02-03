package Hw12Page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class CartPage {

    public SelenideElement cartList = $(".cart_list");
    public SelenideElement checkoutBtn = $("#checkout");

    public void CheckItem7() {
        cartList.shouldHave(Condition.text("7.99"));
    }
    public void CheckItem9() {
        cartList.shouldHave(Condition.text("9.99"));
    }
    public void clickOnCheckoutBtn() {
        checkoutBtn.click();
    }
}




