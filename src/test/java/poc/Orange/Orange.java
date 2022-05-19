package poc.Orange;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class Orange extends TestBase {
	
	private final String url = "https://www.orange.es/";


	@Test
	
	public void Test1() {
		
		driver.get(url);
		Utils.sleep(1);
		

		//OrangeTV
		
		//ok cookies
		driver.findElement(By.xpath("//*[@id=\"consent_prompt_submit\"]")).click();

		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/div/ul/li[3]/a/span")).click();
		Utils.sleep(1);
		
		driver.findElement(By.xpath("//*[@id=\"oH_contenido\"]/div/div[4]/div/div/div[1]/div/div[6]/div/a")).click();
		Utils.sleep(1);
		
		
		System.out.println("Test OrangeTV OK");
	
	}
	
	@Test
	public void Test2() {
	
		driver.get(url);
		Utils.sleep(1);
		

		//Mi cuenta
		
		driver.findElement(By.xpath("//*[@id=\"consent_prompt_submit\"]")).click();

		driver.findElement(By.xpath("/html/body/header/nav/div[1]/div[2]/ul/li[3]/a")).click();
		Utils.sleep(1);
		
		
		driver.findElement(By.xpath("//*[@id=\"rememberPasswordAcceso_30\"]")).click();
		Utils.sleep(2);
		
		
		driver.findElement(By.xpath("//*[@id=\"inputText\"]")).click();
		Utils.sleep(2);
		
		driver.findElement(By.xpath("//*[@id=\\\"inputText\\\"]")).sendKeys("holahola");
		Utils.sleep(2);

		
		
		System.out.println("Test mi cuenta OK");
	
	}
	
	
	
	public void fin() {
		
		driver.close();
		//fail("Not yet implemented");	
}
}
