package steps;

import constains.Urls;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainSearchPage;

import static com.codeborne.selenide.Selenide.open;

public class BSteps {
    @Given("Search Booking page opened")
    public void search_booking_page_opened() {
        open(Urls.BOOKING_SEARCH);
    }

    @When("User input {string} and click Search Button")
    public void userInputHotel(String hotel) {
        MainSearchPage mainSearchPage = new MainSearchPage();
        mainSearchPage.inputHotel(hotel);
        mainSearchPage.clickSearchButton();
    }

    @Then("{string} exists")
    public void existsHotel(String Hotel) {
        MainSearchPage mainSearchPage = new MainSearchPage();
        Assert.assertTrue(mainSearchPage.isHotelDisplayed(Hotel), "Booking hotel didn't find");
    }

    @And("{string} coincided")
    public void coincided(String rating) {
        MainSearchPage mainSearchPage = new MainSearchPage();
        Assert.assertEquals(mainSearchPage.getRatingHotel(rating), rating, "Ratings different");
    }
}