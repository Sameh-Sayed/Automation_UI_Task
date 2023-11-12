package steps;

import com.saucedemo.base.Base;
import com.saucedemo.pages.CartPage;
import com.saucedemo.pages.CheckOutPage;
import com.saucedemo.pages.OverViewPage;
import com.saucedemo.pages.ProductsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps extends Base {
    CartPage cart =new CartPage();
    CheckOutPage check = new CheckOutPage();
    OverViewPage over = new OverViewPage();
    ProductsPage product = new ProductsPage();

    @When("the user add the two most expensive products to their cart")
    public void the_user_add_the_two_most_expensive_products_to_their_cart() {
        product.addMostTwoExpensiveProduct();
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on the cart button")
    public void the_user_click_on_the_cart_button() {
        product.clickOnCart();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should navigate to the cart, and the previously selected products should be displayed")
    public void the_user_should_navigate_to_the_cart_and_the_previously_selected_products_should_be_displayed() {
        cart.displayOfProduct();
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on the checkout button")
    public void the_user_click_on_the_checkout_button() {
        cart.clickOnCheckout();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should navigate to the checkout page")
    public void the_user_should_navigate_to_the_checkout_page() {
        check.checkPresenceOnPAge();
        throw new io.cucumber.java.PendingException();
    }

    @When("the user fill out all the displayed forms")
    public void the_user_fill_out_all_the_displayed_forms() {
        check.fillCheckoutForm();
        throw new io.cucumber.java.PendingException();
    }

    @When("the user click on the continue button")
    public void the_user_click_on_the_continue_button() {
        check.clickOnContinue();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should navigate to the overview page")
    public void the_user_should_navigate_to_the_overview_page() {
        over.checkPresenceOnOverViewPage();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should verify the items' total amount before taxes")
    public void the_user_should_verify_the_items_total_amount_before_taxes() {
        over.verifyTotalAmount();
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should verify the URL matches")
    public void the_user_should_verify_the_url_matches() {
        over.verifyURLMatches();
        throw new io.cucumber.java.PendingException();
    }

}
