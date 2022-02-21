package step_defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.lang.reflect.Type;
import java.util.List;

public class DataTableSteps {
    @Given("user is on NambaFood")
    public void user_is_on_namba_food() {

        System.out.println("user is on NambaFood");
    }
    @When("user clicks on foods")
    public void user_clicks_on_foods() {
        System.out.println("user clicks on foods");
        
    }
    @Then("user should see {string}")
    public void user_should_see(String string) {
        System.out.println();
        
    }
    @Then("user should find sushi category")
    public void user_should_find_sushi_category() {
        
        
    }
    @When("user clicks on sushi")
    public void user_clicks_on_sushi() {
        
        
    }
    @Then("user should see list of cafes")
    public void user_should_see_list_of_cafes() {
        
        
    }
    @Then("user should scroll down the page to Arigato cafe")
    public void user_should_scroll_down_the_page_to_arigato_cafe() {
        
        
    }
    @When("user clicks on Arigato")
    public void user_clicks_on_arigato() {
        
        
    }
    @Then("user should see Arigato menu")
    public void user_should_see_arigato_menu() {
        
        
    }
    @Then("user should find kimchi")
    public void user_should_find_kimchi() {
        
        
    }
    @Then("user should increase quantity of kimchi to {int}")
    public void user_should_increase_quantity_of_kimchi_to(Integer int1) {
        
        
    }
    @Then("user should click on order button")
    public void user_should_click_on_order_button() {
        
        
    }
    @Then("user should see {int} soms in cart")
    public void user_should_see_soms_in_cart(Integer int1) {
        
        
    }


    @Given("user is on https:\\/\\/www.amazon.com\\/")
    public void user_is_on_https_www_amazon_com() {

    }
    @Then("following menu bar should be displayed on menu bar")
    public void following_menu_bar_should_be_displayed_on_menu_bar(io.cucumber.datatable.DataTable dataTable) {
        List <List<String>> button = dataTable.asList((Type) String.class);
    }



}
