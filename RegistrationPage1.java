package PFO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class RegistrationPage1 {
	WebDriver driver;
	@FindBy(how=How.XPATH,using="//a[text()='Register']")
	WebElement register;
	@FindBy(how=How.ID,using="gender-female")
	WebElement gender;
	@FindBy(how=How.NAME,using="FirstName")
	WebElement fname;
	@FindBy(how=How.NAME,using="LastName")
	WebElement lname;
	@FindBy(how=How.NAME,using="DateOfBirthDay")
	WebElement drp;

	RegistrationPage1(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	public void clickReg() throws InterruptedException
	{
		  register.click();
		  Thread.sleep(2000);
	}
	public void clickgender() throws InterruptedException
	{
		if(gender.isDisplayed()==true)  
		    gender.click();
		  Thread.sleep(2000);
	}
	public void addfname(String firstname) throws InterruptedException

	{
		  fname.sendKeys(firstname);
		  Thread.sleep(2000);
	}
	public void addlname(String lastname) throws InterruptedException
	{
		  lname.sendKeys(lastname);
		  Thread.sleep(2000);
	}

	public void drop1(String val)
	{
		drp.click();
		Select s=new Select(drp);
		s.selectByValue(val);
		drp.click();
		
}
