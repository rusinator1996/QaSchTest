package Hw12Page;

public enum PageUrl {

    LOGIN_PAGE("https://www.saucedemo.com/"),

    PRODUCTS_PAGE("https://www.saucedemo.com/inventory.html"),

    CART_PAGE("https://www.saucedemo.com/cart.html"),

    CHECKOUT_STEP1_PAGE("https://www.saucedemo.com/checkout-step-one.html"),

    CHECKOUT_STEP2_PAGE("https://www.saucedemo.com/checkout-step-two.html"),

    CHECKOUT_COMPLETE_PAGE("https://www.saucedemo.com/checkout-complete.html");

    public final String url;

    PageUrl(String url) {
        this.url = url;
    }
}
