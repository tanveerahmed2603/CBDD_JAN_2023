package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;
    @FindBy(name="email")
    WebElement username;

    @FindBy(name="password")
    WebElement password;

    @FindBy(xpath="//input[@value='Log In']")
    WebElement loginBtn;

    @FindBy(xpath="//legend[text()='Welcome to TalentTek']")
    WebElement welcome;

    @FindBy(xpath="//div[@id='error_message']//h5")
    WebElement incorrectCredentialMessage;


    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void validateHomePage(){
        Assert.assertEquals(driver.getTitle(),"Sign In");
    }
    public void enterUsername(String user){
        username.sendKeys(user);
    }

    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void clickLoginButton(){
        loginBtn.click();
    }

    public void loginSuccess(){
        Assert.assertTrue(welcome.isDisplayed());
    }

    public void invalidCredentials(String errorMsg){
        //➥You have entered an incorrect email or student Id.
        String error=incorrectCredentialMessage.getText();
        error=error.substring(error.indexOf('➥')+1);
        System.out.println("Error message:"+error);
        Assert.assertEquals(error,errorMsg);
    }

}
