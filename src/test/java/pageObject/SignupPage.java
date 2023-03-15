package pageObject;

import base.Config;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignupPage extends Config {

    //private WebDriver driver;

    public SignupPage(){
       this.driver=driver;
       PageFactory.initElements(driver,this);
    }

    @FindBy(className = "new-account")
    WebElement createAccntButton;


    @FindBy(name = "firstName")
    WebElement firstName;

    @FindBy(name = "lastName")
    WebElement lastName;

    @FindBy(name = "email")
    WebElement email;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "confirmPassword")
    WebElement confirmPassword;

    @FindBy(name = "month")
    WebElement month;

    @FindBy(name = "day")
    WebElement day;

    @FindBy(name = "year")
    WebElement year;

    @FindBy(id = "male")
    WebElement gender;

    @FindBy(name = "agree")
    WebElement termsCheckbox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement createNewAccntButton;

    @FindBy(css = ".alert-success")
    WebElement successMessage;


    public void clickCreateNewAccountButton(){
        createAccntButton.click();
    }

    public void enterFirstname(String firstname){
        firstName.sendKeys(firstname);
    }

    public void enterLastname(String lastname){
        lastName.sendKeys(lastname);
    }

    public void enterEmail(String mailid){
        email.sendKeys(mailid);
    }

    public void enterPassword(String pwd){
        password.sendKeys(pwd);
    }

    public void enterConfirmPassword(String confirmPwd){
        confirmPassword.sendKeys(confirmPwd);
    }

    public void selectMonth(String monthName){
        Select select = new Select(month);
        select.selectByVisibleText(monthName);
    }

    public void selectDay(String birthDay){
        Select select = new Select(day);
        select.selectByVisibleText(birthDay);
    }

    public void selectYear(String birthYear){
        Select select = new Select(year);
        select.selectByVisibleText(birthYear);
    }

    public void selectGender(){
        gender.click();
    }

    public void clickTermsCheckbox(){
        termsCheckbox.click();
    }

    public void clickCreateAccountButton(){
        createNewAccntButton.click();
    }

    public void verifySuccessMessage(String message){
        String msg = successMessage.getText();
        Assert.assertTrue(msg.contains(message));
    }
}
