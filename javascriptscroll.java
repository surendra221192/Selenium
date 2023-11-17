package selenium_programs;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class javascriptscroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(co);
      driver.get("https://demo.nopcommerce.com/");
      driver.manage().window().maximize();
     Thread.sleep(3000);
     JavascriptExecutor js=(JavascriptExecutor) driver;
    
     //certain pixcel
  // js.executeScript("window.scrollBy(0,1000)","");
   // finding element  
     // WebElement flag=driver.findElement(By.xpath("//button[text()='Vote']"));//kenya
     //js.executeScript("arguments[0].scrollIntoView()",flag);
      //flag.click();
      //scrolling down
      //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	//alternate for click
   // WebElement s=driver.findElement(By.xpath("//button[text()='Search']"));
   // js.executeScript("arguments[0].click()",s);
      js.executeScript("history.go(0)");//refresh
      
	}

}
