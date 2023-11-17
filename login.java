package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
WebDriver driver;
@Given("open the url in chrome browser")
public void open_the_url_in_chrome_browser() {
   WebDriverManager.chromedriver().setup();
   driver=new ChromeDriver();
   driver.get("https://www.google.com");
    
}

@When("User given the valid username and valid password")
public void user_given_the_valid_username_and_valid_password() {
   System.out.println("valid username and password");
}

@And("user clicks the login button")
public void user_clicks_the_login_button() {
   System.out.println("user clicks login button");
}

@Then("user can get access for the application")
public void user_can_get_access_for_the_application() {
  System.out.println("user can login to application");
}

@And("verify he move to login page or not")
public void verify_he_move_to_login_page_or_not() {
   System.out.println("verifying");
}

}
