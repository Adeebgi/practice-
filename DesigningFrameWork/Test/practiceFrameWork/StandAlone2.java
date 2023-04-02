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
import designingframework.pages.productCatalogue;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAlone2 {

	public static void main(String[] args) throws InterruptedException {
		String productName="ZARA COAT 3";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//landing on login page 
		landingPage landing=new landingPage(driver);
		landing.goTO();
		landing.LoginToApplication("sayedesmatullahadeeb@gmail.com", "Esmat@client22");
		
		
		//Object of Product Catalog
		productCatalogue prodcutCatalogue=new productCatalogue(driver);
		List<WebElement> products=prodcutCatalogue.getProductList();
		prodcutCatalogue.AddProductToCart(productName);
		
		
	driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
		
	List<WebElement>CartProducts=driver.findElements(By.cssSelector(".cartSection h3"));
	boolean match=CartProducts.stream().anyMatch(cartproduct->cartproduct.getText().equals(productName));
	Thread.sleep(6000);
	driver.findElement(By.cssSelector(".totalRow button")).click();
	
	Actions a =new Actions(driver);
	a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

	driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
	driver.findElement(By.cssSelector(".action__submit ")).click(); 
	
	String ConfirmMessage=driver.findElement(By.cssSelector(".hero-primary")).getText();
	ConfirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER.");
	driver.close();
	
	}
}
