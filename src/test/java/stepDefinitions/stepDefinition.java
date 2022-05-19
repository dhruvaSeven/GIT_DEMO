package stepDefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class stepDefinition {

    @Given("^user is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        
        System.out.println("This is given code");
        
        
    }
    @When("^user login into application$")
    public void user_login_into_application() throws Throwable {
       
    	System.out.println("This is When code"); 
    	System.out.println("This is to test GIT operation");
        
    }
    @Then("^HomePage is populates$")
    public void homepage_is_populates() throws Throwable {
        
    	System.out.println("This is Then -1 code");
        
    }
    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        
    	System.out.println("This is Then -2 code");
       
    }
    
    @When("^user login into application with username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void user_login_into_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("Logging in with Username and Password");
        System.out.println("UserName is "+strArg1);
        System.out.println("Password is "+strArg2);
    }

    @Then("^HomePage should not  populated$")
    public void homepage_should_not_populated() throws Throwable {
        System.out.println("No HomePage");
    }
    
    @When("^user signup into application with below details$")
    public void user_signup_into_application_with_below_details(DataTable data) throws Throwable {
        List<List<String>> obj= data.asLists();
        System.out.println("Fname is "+obj.get(0).get(0));
        System.out.println("Sname is"+obj.get(0).get(1));
    }
    
    @When("^user login into application username (.+) and Password (.+)$")
    public void user_login_into_application_username_and_password(String username, String password) throws Throwable {
        System.out.println("USername is"+username);
        System.out.println("PAssword is"+password);
    }

}
