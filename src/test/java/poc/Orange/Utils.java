package poc.Orange;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Utils{
	
	
	public static void sleep(int segundos) {
		try {
			Thread.sleep(5000 * segundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public static void pantallazo (WebDriver driver, String pantallazo){
		pantallazo = pantallazo + LocalDate.now();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\i3 9100f\\Desktop\\Evidencias\\" + pantallazo + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	}

		
