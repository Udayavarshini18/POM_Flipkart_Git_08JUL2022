package com.flipkart.testscenarios;

import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.pages.AddToCartPage;
import com.flipkart.pages.LoginPage;
import com.flipkart.pages.SearchProductPage;
import com.flipkart.pages.SelectProductPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PlaceOrder extends TestBase {
 
  @BeforeClass
  public void setUp() {
	  launchBrowser();
		navigateToURL();
	  
  }

  @AfterClass
  public void afterClass() {
  }
 
  @Test(priority = 1)
  public void loginTest() {
	  
	  LoginPage loginPage = new LoginPage();
		boolean actResult = loginPage.validateLogin("9360755020", "udaya7priya");
		Assert.assertTrue(actResult);
	 }
  
  @Test(priority = 2)
  public void searchProductTest() {
	  
	    SearchProductPage searchProductPage = new SearchProductPage();
		boolean actResult=searchProductPage.validateSearchProduct("laptop");
		Assert.assertTrue(actResult);
	}
	  
  @Test(priority = 3)
  public void selectProductTest() {
	  SelectProductPage selectProductPage=new SelectProductPage();
	  boolean actResult=selectProductPage.validateSelectProduct();
	  Assert.assertTrue(actResult);
	    
	}
  
  @Test(priority = 4)
  public void addToCartTest() {
	  
	  AddToCartPage addToCartPage=new AddToCartPage();
	  boolean actResult=addToCartPage.validateAddToCart();
	  Assert.assertTrue(actResult);
	  
	 
	}
  
  @Test(priority = 5)
  public void placeOrderTest(){
	  
	/*  PlaceOrderPage placeOrderPage=new PlaceOrderPage();
	  placeOrderPage.ValidatePlaceOrder();*/
	  
	 	}
  
  @Test(priority = 6)
  public void makePayment() {
	  
	
	}
  
  @Test(priority = 7)
  public void logoutTest() {
	  
  }
   
  
}
