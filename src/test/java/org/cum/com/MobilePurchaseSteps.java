package org.cum.com;



import java.awt.List;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobilePurchaseSteps {
	static WebDriver driver;
	static String txt;
	
	@Given("user lanuch flipkart")
	public void user_lanuch_flipkart() {
		System.setProperty("webdriver.chrome.driver", "F:\\MS-Office 2007\\Private\\eclipse\\CumcumberJunit\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}

	@Given("user login into flipkart")
	public void user_login_into_flipkart() {
		WebElement cancel = driver.findElement(By.xpath("//button[text()='✕']"));
		cancel.click();
	}

	@When("user search mobile")
	public void user_search_mobile() throws InterruptedException {
		WebElement searchtxt = driver.findElement(By.xpath("//input[@type='text']"));
		searchtxt.sendKeys("Samsung Mobiles");
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		Thread.sleep(4000);
	}
	@When("user search mobile by using one dim list")
	public void user_search_mobile_by_using_one_dim_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   java.util.List<String> asList= dataTable.asList();
	   WebElement searchtxt = driver.findElement(By.xpath("//input[@type='text']"));
		searchtxt.sendKeys(asList.get(0),Keys.ENTER);
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		Thread.sleep(4000);
	}

	@When("user search mobile by using one dim map")
	public void user_search_mobile_by_using_one_dim_map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	Map<String, String> asMap= dataTable.asMap(String.class,String.class);
	   WebElement searchtxt = driver.findElement(By.xpath("//input[@type='text']"));
		searchtxt.sendKeys(asMap.get("phone2"),Keys.ENTER);
		WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		Thread.sleep(4000);
		}



	@When("user choose the mobile and doing payment")
	public void user_choose_the_mobile_and_doing_payment() throws InterruptedException {
		WebElement a = driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[1]"));
		a.click();
		Thread.sleep(5000);
		txt=a.getText();
		System.out.println("Mobiles Choose is :" + txt);
		
	}

	@Then("user receive order confirmation message")
	public void user_receive_order_confirmation_message() throws InterruptedException {
		Thread.sleep(4000);
		String pwin=driver.getWindowHandle();
		Set<String> allwin=driver.getWindowHandles();
		for(String x:allwin)
		{
			if(!x.equals(pwin))
			{
				driver.switchTo().window(x);
			}
		}
		WebElement bt=driver.findElement(By.xpath("(//button[contains(@class,'KpZ6')])[1]"));
		bt.click();
		Thread.sleep(5000);
	
	}

}
