package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class AirbnbMethods {

    @Given("user should enter to https:\\/\\/www.airbnb.com\\/")
    public void user_should_enter_to_https_www_airbnb_com() {

        System.out.println("User in Airbnb main page");
       
    }
    @Given("user should verify menu bar button at the right corner")
    public void user_should_verify_menu_bar_button_at_the_right_corner() {

        System.out.println("User see menu bar button");
    }
    @When("user should click to bar button")
    public void user_should_click_to_bar_button() {
        System.out.println("User clicks bar button");
       
    }
    @When("user should see")
    public void user_should_see(io.cucumber.datatable.DataTable dataTable) {

      List <List<String>> button = dataTable.asLists((Type) String.class);

        System.out.println(button.get(0).get(0));
        System.out.println(button.get(0).get(1));
        System.out.println(button.get(0).get(2));
        System.out.println(button.get(0).get(3));
        System.out.println(button.get(0).get(4));


       
    }
    @Then("user should click on Sign up button")
    public void user_should_click_on_sign_up_button() {
        System.out.println("User clicks to Sign up button");
       
    }
    @Then("user should see below {string} these fields")
    public void user_should_see_below_these_fields(String string, io.cucumber.datatable.DataTable dataTable) {
//        string = "Welcome to Airbnb";
        System.out.println("User should see:" + string);
        List <List<String>> button = dataTable.asLists((Type) String.class);
        System.out.println(button.get(0).get(0));
        System.out.println(button.get(0).get(1));

       
    }
    @Then("below these fields, text - {string}")
    public void below_these_fields_text(String string) {
      string = "We’ll call or text you to confirm your number. Standard message and data rates apply.";
        System.out.println("User should see:" + string);
    }
    @Then("below this text, button -{string}")
    public void below_this_text_button(String string) {
       string = "Privacy Policy";
        System.out.println("User should see:" + string);
    }
    @Then("under Privacy Policy, button -{string}")
    public void under_privacy_policy_button(String string) {
       string = "CONTINUE";
        System.out.println("User should see:" + string);
    }
    @Then("under {string}, dividing line with word {string}")
    public void under_dividing_line_with_word(String string, String string2) {
       string = "CONTINUE";
       string2 = "or";
        System.out.println("User should see bellow:" + string +" word " + string2);
       
    }
    @Then("under dividing line, these buttons")
    public void under_dividing_line_these_buttons(io.cucumber.datatable.DataTable dataTable) {

        List <List<String>> button = dataTable.asLists((Type) String.class);
        System.out.println(button.get(0).get(0));
        System.out.println(button.get(0).get(1));
        System.out.println(button.get(0).get(2));
        System.out.println(button.get(0).get(3));

       
    }

}
