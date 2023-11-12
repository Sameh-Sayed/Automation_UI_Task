package steps;


import com.saucedemo.base.Base;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class LoginSteps extends Base {
    LoginPage loginPage = new LoginPage();
    ProductsPage product = new ProductsPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        launchBrowser();
        throw new io.cucumber.java.PendingException();
    }

    @When("the user enters a valid username {string} and password {string}")
    public void the_user_enters_a_valid_username_and_password(String username, String password) throws InterruptedException {
        loginPage = new LoginPage();
        loginPage.login(username,password);

        throw new io.cucumber.java.PendingException();
    }

    @When("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        product = new ProductsPage();
        product.checkLogo();

        throw new io.cucumber.java.PendingException();
    }
    @When("the user enters an invalid username {string} and password {string}")
    public void the_user_enters_an_invalid_username_and_password(String username, String password) throws InterruptedException {
        loginPage.login(username,password);

        throw new io.cucumber.java.PendingException();
    }



    @Then("the user should see an error message Invalid username or password {string}")
    public void the_user_should_see_an_error_message_invalid_username_or_password(String erorrDescr) {
        loginPage = new LoginPage();
        loginPage.checkErrorMessage(erorrDescr);
        throw new io.cucumber.java.PendingException();
    }



}
