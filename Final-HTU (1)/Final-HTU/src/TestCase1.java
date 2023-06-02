import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends Parameters {

	
	@BeforeTest
	public  void beforeTest() {
		driver.manage().window().maximize();
		driver.get("https://www.almosafer.com");
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				

	} 
	
	@Test
	public void  checkTheDefualtLanguage() {
//		String Language = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]")).getText();
//		myAssret.assertEquals(Language,"العربية");
		String CurrentURL = driver.getCurrentUrl();
		myAssert.assertEquals(CurrentURL, "https://www.almosafer.com/en");
			
		} 

	
	@AfterTest
	public void afterTest() {
		myAssert.assertAll();
		
	}
}
