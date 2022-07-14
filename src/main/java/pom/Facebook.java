package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	



@FindBy (xpath="//input[@id='email']") private WebElement email;
@FindBy (xpath="//input[@id='pass']") private WebElement password;
@FindBy (xpath="//button[@name='login']") private WebElement login;
@FindBy (xpath="//a[text()='Forgotten password?]") private WebElement forgot;
@FindBy (xpath="//a[@data-testid='open-registration-form-button']") private WebElement create;
@FindBy (xpath="//a[text()='Create a Page") private WebElement createPage;

public Facebook(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void enterEmailId(String emailID) {
	email.sendKeys(emailID);
}
public void enterPassword(String pass){
	password.sendKeys(pass);
}
public void clickOnLogin() {
	login.click();
}

public void clickOnForgotPassword() {
	forgot.click();
}

public void clickOnCreateAccount() {
	create.click();
}
public void clickOnCreatePage() {
	createPage.click();
	
}
}