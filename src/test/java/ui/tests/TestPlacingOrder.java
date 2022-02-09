package ui.tests;

import ui.base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import ui.com.automationpracticesite.pages.AuthPage;

public class TestPlacingOrder extends BaseTests {

    @Test
    public void placeOrderTest() {
        Assert.assertEquals(
                new AuthPage(driver).provideEmailStep(
                        faker.internet().emailAddress()
                ).createAccount(
                                randomTitleSelection(),
                                faker.name().firstName(),
                                faker.name().lastName(),
                                faker.internet().password(),
                                generateRandomNumber(1, 30),
                                generateRandomNumber(1, 12),
                                generateRandomNumber(1, 50),
                                faker.address().streetName(),
                                faker.address().firstName(),
                                faker.company().name(),
                                faker.address().streetName(),
                                faker.address().secondaryAddress(),
                                faker.address().streetAddress(),
                                generateRandomNumber(1, 5),
                        55555,
                                faker.name().fullName(),
                                "012345657",
                                "012345657",
                                faker.name().lastName()
                        )
                        .chooseBlousesFromWomenCategory()
                        .selectAndCheckout()
                        .proceedToCheckout()
                        .proceedAddressStep4()
                        .proceedShippingStep5().checkoutFinalStep()
                        .confirmOrder()
                        .navigateToOrdersHistoryPage()
                        .count(),
                1
        );
    }
}
