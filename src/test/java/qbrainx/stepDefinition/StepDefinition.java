package qbrainx.stepDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import qbrainx.locators.LoginPage;
import qbrainx.locators.SearchPage;
import qbrainx.utility.UtilityClass;

public class StepDefinition extends UtilityClass {

	WebDriver driver;
	LoginPage page;
	SearchPage search;

	@Given("User has to enter the url {string}")
	public void user_has_to_enter_the_url(String s1) {
		driver = getDriver();
		loadUrl(s1);
	}

	@When("User ha to enter the usernam {string} and {string}")
	public void user_ha_to_enter_the_usernam_and(String s2, String s3) {
		page = new LoginPage();
		fill(page.getUser().get(0), s2);
		fill(page.getPass().get(0), s3);
	}

	@When("User has to click the login button to enter into the home page")
	public void user_has_to_click_the_login_button_to_enter_into_the_home_page() {
		btnclk(page.getLoginbtn().get(0));
	}

	@Then("User has to verify whether he is in the correct page or not")
	public void user_has_to_verify_whether_he_is_in_the_correct_page_or_not() {
		getTitle();
	}

	@Given("User is in the hotel search page")
	public void user_is_in_the_hotel_search_page() {
		getUrl();
	}

	@When("User has to select the location {string} and {string} in hotel search page")
	public void user_has_to_select_the_location_and_in_hotel_search_page(String s4, String s5) {
		search = new SearchPage();
		selectByText(search.getLocation().get(0), s4);
		selectByText(search.getHotels().get(0), s5);
	}

	@When("User has to select the room type {string} and number of rooms {string} in hotel search page")
	public void user_has_to_select_the_room_type_and_number_of_rooms_in_hotel_search_page(String s6, String s7) {
		search = new SearchPage();
		selectByText(search.getRoomtype().get(0), s6);
		selectByText(search.getRoomno().get(0), s7);
	}

	@When("User has to select the adults {string} and childs {string} in hotel search page")
	public void user_has_to_select_the_adults_and_childs_in_hotel_search_page(String s8, String s9) {
		search = new SearchPage();
		selectByText(search.getAdult().get(0), s8);
		selectByText(search.getAdult().get(0), s9);
	}

	@Then("User has to click the sublit button to proceed booking process")
	public void user_has_to_click_the_sublit_button_to_proceed_booking_process() {
		search = new SearchPage();
		btnclk(search.getSubmit().get(0));
	}

}
