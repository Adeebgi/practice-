package designingframework.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import designingFrameWrok.AbstractPage.Abstract;

public class productCatalogue extends Abstract{
	
	WebDriver driver;
	//this is the constructor 
	public productCatalogue(WebDriver driver)
	
	{
		//super key word used to send the variable from child to the parent. 
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	@FindBy(css=".card-body button:last-of-type")
	WebElement addtocart;
	
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	
	
	//when there is find element located, then its return type is By. 
	By productsBy=By.cssSelector(".mb-3");
	
	By toastMessage=By.id("toast-container");
	
	public List<WebElement> getProductList(){
	 waitElementAppear(productsBy);
		
		return products;
	
	}
	
	public WebElement getProductName(String productName) {
		
	
	WebElement prod=getProductList().stream().filter(product->product.findElement
	(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse (null);
	
	return prod;
	
}
	
	//Note: If the scope of an element is not driver, then we can't use @FindBy or page factory
	public void AddProductToCart(String productName) {
	addtocart.click();
	 waitElementAppear(toastMessage);
	 WaitElementToDisappear(spinner);
	
}
}
