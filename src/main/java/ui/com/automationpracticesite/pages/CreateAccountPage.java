package ui.com.automationpracticesite.pages;

import helpers.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

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
            ElementActions.click(driver, titleMr);
        } else {
            ElementActions.click(driver, titleMrs);
        }
        ElementActions.type(driver, firstNameTxt, firstName);
        ElementActions.type(driver, lastNameTxt, lastName);
        ElementActions.type(driver, passwordTxt, password);
        ElementActions.selectFromDropDown(driver, dateOfBirthDaySelect, dateOfBirthDay);
        ElementActions.selectFromDropDown(driver, dateOfBirthMonthSelect, dateOfBirthMonth);
        ElementActions.selectFromDropDown(driver, dateOfBirthYearSelect, dateOfBirthYear);
        ElementActions.click(driver, newsletterCheckbox);
        ElementActions.click(driver, uniformOptionCheckbox);
        ElementActions.type(driver, yourAddressFirstNameTxt, yourAddressFirstName);
        ElementActions.type(driver, yourAddressLastNameTxt, yourAddressLastName);
        ElementActions.type(driver, companyTxt, company);
        ElementActions.type(driver, addressTxt, address);
        ElementActions.type(driver, addressLine2Txt, addressLine2);
        ElementActions.type(driver, cityTxt, city);
        ElementActions.selectFromDropDown(driver, stateSelect, state);
        ElementActions.type(driver, zipPostalCodeTxt, String.valueOf(zipPostalCode));
        ElementActions.type(driver, additionalInformationTxt, additionalInformation);
        ElementActions.type(driver, homePhoneTxt, homePhone);
        ElementActions.type(driver, mobilePhoneTxt, mobilePhone);
        ElementActions.type(driver, addressAliasTxt, addressAlias);
        ElementActions.click(driver, registerBtn);
        return new MyAccountPage(driver);
    }

}
