package steps;

import com.swinji.base.Base;
import com.swinji.pages.CoursesPage;
import com.swinji.pages.HomePage;
import com.swinji.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AddSteps extends Base {

    LoginPage log;
    HomePage home;
    CoursesPage cour ;
    @Given("User open website")
    public void user_open_website() {
    }

    @And("Login with valid {string} and {string}")
    public void login_with_valid_email_and_password(String email , String password) throws InterruptedException {
        log = new LoginPage();
        log.login(email,password);
    }

    @And("Open courses page")
    public void open_courses_page() {
        home = new HomePage();
        home.clickCoursesButton();


    }

    @When("open create course form")
    public void open_create_course_form() {
        cour = new CoursesPage();

        cour.clickAddCourseButton();


    }

    @And("fill form with all data and course name {string}")
    public void fill_form_with_all_data(String course) {
        cour.addNewCourse(course);



    }

    @And("open course page")
    public void open_course_page() {
        home.clickCoursesButton();
    }

    @And("search for {string} added")
    public void search_for_course_added(String course) {

        cour.searchForCourse(course);
    }

    @Then("course should be exist")
    public void course_should_be_exist() {

        cour.assertCourseAdded();
    }



}
