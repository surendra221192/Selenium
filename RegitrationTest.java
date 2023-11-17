package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class RegitrationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.nopcommerce.com/");
		  driver.manage().window().maximize();
		  RegistrationPage rp=new RegistrationPage(driver);
		  rp.clickReg();
		  rp.clickgender();
		  rp.addfname("first name value");
		  rp.addlname("last name value");
	}

}
