package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner_class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinition {
	
	public static WebDriver driver = Runner_class.driver;
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com");
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement sign = driver.findElement(By.id("username"));
		sign.sendKeys("DeepakU1");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Deepak@123");
		
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}

	@When("^user To Select The Location Of The Hotels$")
	public void user_To_Select_The_Location_Of_The_Hotels() throws Throwable {
		WebElement loc = driver.findElement(By.id("location"));
		Select sel = new Select(loc);
		sel.selectByVisibleText("Melbourne");
		
	}

	@When("^user To Select The Hotels$")
	public void user_To_Select_The_Hotels() throws Throwable {
		WebElement hot = driver.findElement(By.id("hotels"));
		Select sel1 = new Select(hot);
		sel1.selectByVisibleText("Hotel Creek");
	}

	@When("^user To Select The Room Type$")
	public void user_To_Select_The_Room_Type() throws Throwable {
		WebElement room = driver.findElement(By.id("room_type"));
		Select sel2 = new Select(room);
		sel2.selectByVisibleText("Standard");
	}

	@When("^user To Select The Number Of Rooms$")
	public void user_To_Select_The_Number_Of_Rooms() throws Throwable {
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		Select sel3 = new Select(roomnos);
		sel3.selectByVisibleText("2 - Two");
	}

	@When("^user To Enter The Check In Date$")
	public void user_To_Enter_The_Check_In_Date() throws Throwable {
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.clear();
		datein.sendKeys("27/09/2022");
	}

	@When("^user To Enter The Check Out Date$")
	public void user_To_Enter_The_Check_Out_Date() throws Throwable {
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.clear();
		dateout.sendKeys("29/09/2022");
	}

	@When("^user To Select The Adults Per Room$")
	public void user_To_Select_The_Adults_Per_Room() throws Throwable {
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select sel4 = new Select(adult);
		sel4.selectByVisibleText("2 - Two");
	}

	@When("^user To Select The Children Per Room$")
	public void user_To_Select_The_Children_Per_Room() throws Throwable {
		WebElement child = driver.findElement(By.id("child_room"));
		Select sel5 = new Select(child);
		sel5.selectByVisibleText("2 - Two");
	}

	@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
	}

	@When("^user To Select The Hotel$")
	public void user_To_Select_The_Hotel() throws Throwable {
		WebElement button = driver.findElement(By.id("radiobutton_0"));
		button.click();
	}

	@Then("^user Click The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
	}

	@When("^user To Enter The First Name In First Name Field$")
	public void user_To_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Deepak");
	}

	@When("^user To Enter The Last Name In the Last Name Field$")
	public void user_To_Enter_The_Last_Name_In_the_Last_Name_Field() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Yuvan");
	}

	@When("^user To Enter The Billing Address In the Billing Address Field$")
	public void user_To_Enter_The_Billing_Address_In_the_Billing_Address_Field() throws Throwable {
		WebElement address1 = driver.findElement(By.id("address"));
		address1.sendKeys("12/40,yuvan street,YUvan Studio");
	}

	@When("^user To Enter The Credit Card No In the Credit Card No Field$")
	public void user_To_Enter_The_Credit_Card_No_In_the_Credit_Card_No_Field() throws Throwable {
		WebElement cn = driver.findElement(By.id("cc_num"));
		cn.sendKeys("1234567812345678");
	}

	@When("^user To Select The Credit Card Type In the Credit Card Type Field$")
	public void user_To_Select_The_Credit_Card_Type_In_the_Credit_Card_Type_Field() throws Throwable {
		WebElement cn2 = driver.findElement(By.id("cc_type"));
		Select sel6 = new Select(cn2);
		sel6.selectByVisibleText("American Express");
	}

	@When("^user To Select The Expiry Date In the Expiry Date Field$")
	public void user_To_Select_The_Expiry_Date_In_the_Expiry_Date_Field() throws Throwable {
		WebElement cn3 = driver.findElement(By.id("cc_exp_month"));
		Select sel7 = new Select(cn3);
		sel7.selectByVisibleText("June");
	}

	@When("^user To Select The Expiry Date Year In the Expiry Date Year Field$")
	public void user_To_Select_The_Expiry_Date_Year_In_the_Expiry_Date_Year_Field() throws Throwable {
		WebElement cn4 = driver.findElement(By.id("cc_exp_year"));
		Select sel8 = new Select(cn4);
		sel8.selectByVisibleText("2022");
	}

	@When("^user To Enter The CVV Number In the CVV Number Field$")
	public void user_To_Enter_The_CVV_Number_In_the_CVV_Number_Field() throws Throwable {
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("126");
	}

	@Then("^user Click The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//input[@type='button'])[3]")).click();
	}


}
