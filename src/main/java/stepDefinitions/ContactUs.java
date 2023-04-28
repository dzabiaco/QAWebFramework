package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ContactUs {
    private WebDriver driver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("I access page")
    public void i_access_page() {
        driver.get("https://www.google.com/");
    }

    @When("I enter a first name")
    public void i_enter_a_first_name() {

    }

    @When("I enter last name")
    public void i_enter_last_name() {

    }

    @When("I enter an email adress")
    public void i_enter_an_email_adress() {

    }

    @When("I enter comment")
    public void i_enter_comment() {

    }

    @When("I click on submit")
    public void i_click_on_submit() {

    }

    @Then("I should see a messages")
    public void i_should_see_a_messages() {

    }

}