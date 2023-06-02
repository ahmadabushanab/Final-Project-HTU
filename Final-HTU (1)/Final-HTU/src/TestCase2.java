import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase2 extends Parameters{

	@BeforeTest
	public  void beforeTest() {
		driver.manage().window().maximize();
		driver.get(URLS[1]);
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
	} 

	@Test
	public void checkTheDefualtCurrency() {
		String Actualvaue= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
		myAssert.assertEquals(Actualvaue,"SAR");
			
		} 
	
	@AfterTest
	public void afterTest() {
		myAssert.assertAll();
		
	}
}
