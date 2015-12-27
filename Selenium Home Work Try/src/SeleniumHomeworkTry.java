import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumHomeworkTry {

	public static void main(String[] args) throws InterruptedException 
	{
		
		FirefoxDriver f = new FirefoxDriver(); 
		f.get("http://www.target.com");
		Thread.sleep(2000);
		f.findElement(By.id("OpenLoginPopup")).click();
		f.findElement(By.id(".//*[@id='categoryHeader']/a")).click();
		f.findElement(By.xpath("//input[@id='firstName']")).sendKeys("tasmiah");
		
		
	
		
		

	
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}














}
