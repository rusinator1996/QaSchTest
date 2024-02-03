package Hw12Page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class ProductsPage {

    public SelenideElement addToCartBtn9 = $("#add-to-cart-sauce-labs-bike-light");
    public SelenideElement addToCartBtn7 = $("#add-to-cart-sauce-labs-onesie");
    public SelenideElement shopingCart = $("#shopping_cart_container");

    public void addToCart7() {
        addToCartBtn7.click();
    }

    public void addToCart9() {
        addToCartBtn9.click();
    }

    public void goToCart() {
        shopingCart.click();
    }
}



