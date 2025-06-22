package com.web.automation.base;

import org.openqa.selenium.WebDriver;

import com.web.automation.pages.ForgotPasswordPage;
import com.web.automation.pages.LandingPage;
import com.web.automation.pages.LoginPage;
import com.web.automation.pages.ProductComparePage;
import com.web.automation.pages.RegisterPage;
import com.web.automation.pages.SearchPage;

public class PageInstance {
	
	protected WebDriver driver;
	private LandingPage landingPage;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private SearchPage searchPage;
	private ProductComparePage productComparePage;
	private ForgotPasswordPage forgotPasswordPage;

    public PageInstance(TestContext context) {
        this.driver = context.driver;
    }

    public LandingPage getLandingPageInstance() {
        if (landingPage == null) {
        	landingPage = new LandingPage(driver);
        }
        return landingPage;
    }
    
    public LoginPage getLoginPageInstance() {
        if (loginPage == null) {
        	loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    
    public RegisterPage getRegisterPageInstance() {
        if (registerPage == null) {
        	registerPage = new RegisterPage(driver);
        }
        return registerPage;
    }
    
    public SearchPage getSearchPageInstance() {
        if (searchPage == null) {
        	searchPage = new SearchPage(driver);
        }
        return searchPage;
    }
    
    public ProductComparePage getProductComparePageInstance() {
        if (productComparePage == null) {
        	productComparePage = new ProductComparePage(driver);
        }
        return productComparePage;
    }
    
    public ForgotPasswordPage getForgotPasswordPageInstance() {
        if (forgotPasswordPage == null) {
        	forgotPasswordPage = new ForgotPasswordPage(driver);
        }
        return forgotPasswordPage;
    }
}
