package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainSearchPage {
    private SelenideElement hotelInput = $(By.name("ss"));
    private SelenideElement searchButton = $(By.xpath("//span[text()='Search']/parent::button"));

    public void inputHotel(String hotel) {
        hotelInput.setValue(hotel);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public boolean isHotelDisplayed(String hotel) {
        String tab = String.format("//div[text() = '%s']", hotel);
        return $(By.xpath(tab)).shouldBe(Condition.visible).isDisplayed();
    }

    public String getRatingHotel(String rating) {
        String tabRating = String.format("//div[@aria-label ='Scored %s '][1]", rating);
        return $(By.xpath(tabRating)).getText();
    }
}