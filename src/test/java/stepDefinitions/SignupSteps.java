package stepDefinitions;

import base.Config;
import base.TestData;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.SignupPage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SignupSteps {
    Faker faker= new Faker();
    SignupPage signupPage=new SignupPage();
    @When("user click on create new account button")
    public void userClickOnCreateNewAccountButton() {
        signupPage.clickCreateNewAccountButton();
    }

    @And("user enter firstname")
    public void userEnterFirstname() {
        TestData.firstName=faker.name().firstName();
        signupPage.enterFirstname(TestData.firstName);
    }

    @And("user enter lastname")
    public void userEnterLastname() {
        TestData.lastName=faker.name().lastName();
        signupPage.enterLastname(TestData.lastName);
    }

    @And("user enter unique email address")
    public void userEnterUniqueEmailAddress() {
        TestData.email = TestData.firstName+"."+TestData.lastName+"@gmail.com";
        signupPage.enterEmail(TestData.email);
    }

    @And("user enter password")
    public void userEnterPassword() {
        TestData.newPassword = faker.internet().password();
        signupPage.enterPassword(TestData.newPassword);
    }

    @And("user enter confirm password")
    public void userEnterConfirmPassword() {
        signupPage.enterConfirmPassword(TestData.newPassword);
    }

    @And("user provide Birth month , day and year")
    public void userProvideBirhMonthDayAndYear() {
       signupPage.selectMonth(TestData.birthMonth);
       signupPage.selectDay(TestData.birthDay);
       signupPage.selectYear(TestData.birthYear);
    }

    @And("user select gender")
    public void userSelectGender() {
        signupPage.selectGender();
    }

    @And("user click on Terms checkbox")
    public void userClickOnTermsCheckbox() {
        signupPage.clickTermsCheckbox();
    }

    @And("user click on Create my account button")
    public void userClickOnCreateMyAccountButton() {
        signupPage.clickCreateAccountButton();
    }

    @Then("user should see {string} message")
    public void userShouldSeeMessage(String successMessage) {
        signupPage.verifySuccessMessage(successMessage);
    }
}
