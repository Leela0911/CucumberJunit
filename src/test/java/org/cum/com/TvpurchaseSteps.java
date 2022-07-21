package org.cum.com;

import java.util.Map;
import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TvpurchaseSteps {
	static String txt;
		
	@When("user search TV")
	public void user_search_TV() throws InterruptedException {
					WebElement searchtxt =    MobilePurchaseSteps.driver.findElement(By.xpath("//input[@type='text']"));
			searchtxt.sendKeys("Samsung TV");
			WebElement search =    MobilePurchaseSteps.driver.findElement(By.xpath("//button[@type='submit']"));
			search.click();
			Thread.sleep(4000);
	}

	@When("user choose the TV and doing payment")
	public void user_choose_the_TV_and_doing_payment() throws InterruptedException {
		WebElement a =   MobilePurchaseSteps.driver.findElement(By.xpath("(//div[contains(@class,'_4rR01T')])[1]"));
		a.click();
		Thread.sleep(5000);
		txt=a.getText();
		System.out.println("TV Choose is :" + txt);
	}

	@When("user search TV by using one dim list")
	public void user_search_TV_by_using_one_dim_list(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	java.util.List<String> asList= dataTable.asList();
	   WebElement searchtxt =   MobilePurchaseSteps.driver.findElement(By.xpath("//input[@type='text']"));
		searchtxt.sendKeys(asList.get(0),Keys.ENTER);
		WebElement search =    MobilePurchaseSteps.driver.findElement(By.xpath("//button[@type='submit']"));
		search.click();
		Thread.sleep(4000);
	}

	@When("user search TV by using one dim map")
	public void user_search_TV_by_using_one_dim_map(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Map<String, String> asMap= dataTable.asMap(String.class,String.class);
		   WebElement searchtxt =    MobilePurchaseSteps.driver.findElement(By.xpath("//input[@type='text']"));
			searchtxt.sendKeys(asMap.get("TV2"),Keys.ENTER);
			WebElement search =    MobilePurchaseSteps.driver.findElement(By.xpath("//button[@type='submit']"));
			search.click();
			Thread.sleep(4000);
	}

}
