package designingFrameWrok.AbstractPage;

import java.time.Duration;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.maven.api.settings.Server;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Abstract {

	WebDriver driver;
	
	
	public Abstract(WebDriver driver) {
		this.driver=driver;
	}

	public void waitElementAppear(By findBy) {
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
}
	
	public void WaitElementToDisappear(WebElement ele){
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));  
		
	}

}