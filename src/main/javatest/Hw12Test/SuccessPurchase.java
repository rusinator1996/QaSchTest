package Hw12Test;

import Hw12Page.*;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class SuccessPurchase {

private final LoginPage LoginPage = new LoginPage();
private final ProductsPage ProductsPage = new ProductsPage();
private final CartPage CartPage = new CartPage();
private final CheckoutStepOnePage CheckoutStepOnePage = new CheckoutStepOnePage();
private final CheckoutStepTwoPage CheckoutStepTwoPage = new CheckoutStepTwoPage();

private  final CheckoutCompletePage CheckOutCompletePage = new CheckoutCompletePage();



private final String LOGIN_PAGE = PageUrl.LOGIN_PAGE.url;
@Test

public void validPurchase(){
    Selenide.open(LOGIN_PAGE);
    LoginPage.setLogin("standard_user");
    LoginPage.setPassword("secret_sauce");
    LoginPage.clickLoginButton();
    ProductsPage.addToCart7();
    ProductsPage.addToCart9();
    ProductsPage.goToCart();
    CartPage.CheckItem7();
    CartPage.CheckItem9();
    CartPage.clickOnCheckoutBtn();
    CheckoutStepOnePage.setFirstName("Juan");
    CheckoutStepOnePage.setLastName("Shoperman");
    CheckoutStepOnePage.setPostalCode("07702");
    CheckoutStepOnePage.clickContinueBtn();
    CheckoutStepTwoPage.printTaxToConsole();
    CheckoutStepTwoPage.clickOnFinishBtn();
    CheckOutCompletePage.checkTextOnCompletePage();


}


}
