package selenium_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
public class conditional_radio_check {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin.*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement tb1=driver.findElement(By.id("name"));
		if((tb1.isEnabled()==true)&&(tb1.isDisplayed()==true))
		{
		    tb1.sendKeys("Surendra");
		}
		WebElement tb2=driver.findElement(By.id("email"));
		if((tb2.isEnabled()==true)&&(tb1.isDisplayed()==true))
		{
		    tb2.sendKeys("Suri.marrivada@gmail.com");
		}
		WebElement tb3=driver.findElement(By.id("phone"));
		if((tb3.isEnabled()==true)&&(tb1.isDisplayed()==true))
		{
		    tb3.sendKeys("9000163777");
		}
		WebElement tb4=driver.findElement(By.id("textarea"));
		if((tb4.isEnabled()==true)&&(tb1.isDisplayed()==true))
		{
		    tb4.sendKeys("bhimavaram");
		}
		WebElement radio=driver.findElement(By.id("male"));
		if((radio.isEnabled()==true)&&(radio.isDisplayed()==true))
		{
		radio.click();
		}
		WebElement c1=driver.findElement(By.id("sunday"));
		if((c1.isEnabled()==true)&&(c1.isDisplayed()==true))
		{
			if(c1.isSelected()==false)
        {
		c1.click();//se
        }
		WebElement c2=driver.findElement(By.id("tuesday"));
		if((c2.isEnabled()==true)&&(c2.isDisplayed()==true))
		{
			if(c2.isSelected()==false)
			{
		c2.click();	//unse
		
		}
			
			WebElement c3=driver.findElement(By.id("friday"));
			if((c3.isEnabled()==true)&&(c3.isDisplayed()==true))
			{
				if(c3.isSelected()==false)
				{
			c3.click();	//unse
			
		//dropdown
	WebElement drp=	driver.findElement(By.id("country"));
	drp.click();
	Select s=new Select(drp);
	s.selectByVisibleText("India");
	//s.selectByValue("australia");
	//s.selectByIndex(3);
	drp.click();
	WebElement drpp=driver.findElement(By.id("colors"));
	drpp.click();
	Select s1=new Select(drpp);
	s1.selectByVisibleText("blue");
	drpp.click();
	
	
		}
		}
	}
}
	}
}
	



	


