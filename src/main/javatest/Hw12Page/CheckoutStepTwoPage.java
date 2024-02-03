package Hw12Page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

@Getter
public class CheckoutStepTwoPage {

    public SelenideElement taxForTotalPrice = $(".summary_tax_label");
    public SelenideElement finishBtn = $("#finish");

    public void printTaxToConsole() {
        SelenideElement element = taxForTotalPrice;
        String text = element.getText();
        System.out.println("Відсоток податку від покупки: " + text);
    }
    public void clickOnFinishBtn(){
        finishBtn.click();
    }

}