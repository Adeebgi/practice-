package practiceFrameWork;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v110.webauthn.model.CredentialAsserted;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import designingframework.pages.landingPage;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone {

	public static void main(String[] args) throws InterruptedException {
		String productName="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/client");
		landingPage landing=new landingPage(driver);
		driver.findElement(By.cssSelector("#userEmail")).sendKeys("sayedesmatullahadeeb@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Esmat@client22");
		driver.findElement(By.id("login")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".mb-3")));
		
		List<WebElement> products=driver.findElements(By.cssSelector(".mb-3"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement prod=products.stream().filter(product->product.findElement
		(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse (null);
		driver.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
		driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
	List<WebElement>CartProducts=driver.findElements(By.cssSelector(".cartSection h3"));
	boolean match=CartProducts.stream().anyMatch(cartproduct->cartproduct.getText().equals(productName));
	Thread.sleep(6000);
	driver.findElement(By.cssSelector(".totalRow button")).click();
	
	Actions a =new Actions(driver);
	a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

	driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	driver.findElement(By.cssSelector(".action__submit ")).click(); 
	
	String ConfirmMessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
	ConfirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER.");
	driver.close();
	
	}
}
