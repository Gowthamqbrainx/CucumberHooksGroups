package qbrainx.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import qbrainx.utility.UtilityClass;

public class SearchPage extends UtilityClass {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private List<WebElement> location;

	@FindBy(id = "hotels")
	private List<WebElement> hotels;

	@FindBy(id = "room_type")
	private List<WebElement> roomtype;

	@FindBy(id = "room_nos")
	private List<WebElement> roomno;

	@FindBy(id = "adult_room")
	private List<WebElement> adult;

	@FindBy(id = "child_room")
	private List<WebElement> child;

	@FindBy(id = "Submit")
	private List<WebElement> submit;

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotels() {
		return hotels;
	}

	public List<WebElement> getRoomtype() {
		return roomtype;
	}

	public List<WebElement> getRoomno() {
		return roomno;
	}

	public List<WebElement> getAdult() {
		return adult;
	}

	public List<WebElement> getChild() {
		return child;
	}

	public List<WebElement> getSubmit() {
		return submit;
	}

}
