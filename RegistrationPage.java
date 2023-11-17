package POM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class RegistrationPage {
	WebDriver driver;
    By register=By.xpath("//a[text()='Register']");
    By fgender=By.id("gender-female");
    By fname=By.name("FirstName");
    By lname=By.name("LastName");
    
    RegistrationPage(WebDriver driver)
    {
  	  this.driver=driver;
  	  
    }
    public void clickReg() throws InterruptedException
    {
  	  driver.findElement(register).click();
  	  Thread.sleep(2000);
    }
    public void clickgender() throws InterruptedException
    {
  	  driver.findElement(fgender).click();
  	  Thread.sleep(2000);
    }
    public void addfname(String firstname) throws InterruptedException

    {
  	  driver.findElement(fname).sendKeys(firstname);
  	  Thread.sleep(2000);
    }
    public void addlname(String lastname) throws InterruptedException
    {
  	  driver.findElement(lname).sendKeys(lastname);
  	  Thread.sleep(2000);
}
