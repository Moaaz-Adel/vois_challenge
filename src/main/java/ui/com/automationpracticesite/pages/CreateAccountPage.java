package ui.com.automationpracticesite.pages;

import helpers.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private WebDriver driver;

    // YOUR PERSONAL INFORMATION SECTION
    private By titleMr = By.id("id_gender1");
    private By titleMrs = By.id("id_gender2");
    private By firstNameTxt = By.id("customer_firstname");
    private By lastNameTxt = By.id("customer_lastname");
    private By passwordTxt = By.id("passwd");
    private By dateOfBirthDaySelect = By.id("days");
    private By dateOfBirthMonthSelect = By.id("months");
    private By dateOfBirthYearSelect = By.id("years");
    private By newsletterCheckbox = By.id("uniform-newsletter");
    private By uniformOptionCheckbox = By.id("uniform-optin");


    //YOUR ADDRESS SECTION
    private By yourAddressFirstNameTxt = By.id("firstname");
    private By yourAddressLastNameTxt = By.id("lastname");
    private By companyTxt = By.id("company");
    private By addressTxt = By.id("address1");
    private By addressLine2Txt = By.id("address2");
    private By cityTxt= By.id("city");
    private By stateSelect = By.id("id_state");
    private By zipPostalCodeTxt = By.id("postcode");
    private By countryTxt = By.id("id_country");
    private By additionalInformationTxt = By.id("other");
    private By homePhoneTxt = By.id("phone");
    private By mobilePhoneTxt = By.id("phone_mobile");
    private By addressAliasTxt = By.id("alias");
    private By registerBtn = By.id("submitAccount");

    public CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public MyAccountPage createAccount(
            String title,
            String firstName,
            String lastName,
            String password,
            int dateOfBirthDay,
            int dateOfBirthMonth,
            int dateOfBirthYear,
            String yourAddressFirstName,
            String yourAddressLastName,
            String company,
            String address,
            String addressLine2,
            String city,
            int state,
            int zipPostalCode,
            String additionalInformation,
            String homePhone,
            String mobilePhone,
            String addressAlias
    ) {
        if(title == "male") {
            Actions.click(driver, titleMr);
        } else {
            Actions.click(driver, titleMrs);
        }
        Actions.type(driver, firstNameTxt, firstName);
        Actions.type(driver, lastNameTxt, lastName);
        Actions.type(driver, passwordTxt, password);
        Actions.selectFromDropDown(driver, dateOfBirthDaySelect, dateOfBirthDay);
        Actions.selectFromDropDown(driver, dateOfBirthMonthSelect, dateOfBirthMonth);
        Actions.selectFromDropDown(driver, dateOfBirthYearSelect, dateOfBirthYear);
        Actions.click(driver, newsletterCheckbox);
        Actions.click(driver, uniformOptionCheckbox);
        Actions.type(driver, yourAddressFirstNameTxt, yourAddressFirstName);
        Actions.type(driver, yourAddressLastNameTxt, yourAddressLastName);
        Actions.type(driver, companyTxt, company);
        Actions.type(driver, addressTxt, address);
        Actions.type(driver, addressLine2Txt, addressLine2);
        Actions.type(driver, cityTxt, city);
        Actions.selectFromDropDown(driver, stateSelect, state);
        Actions.type(driver, zipPostalCodeTxt, String.valueOf(zipPostalCode));
        Actions.type(driver, additionalInformationTxt, additionalInformation);
        Actions.type(driver, homePhoneTxt, homePhone);
        Actions.type(driver, mobilePhoneTxt, mobilePhone);
        Actions.type(driver, addressAliasTxt, addressAlias);
        Actions.click(driver, registerBtn);
        return new MyAccountPage(driver);
    }

}
