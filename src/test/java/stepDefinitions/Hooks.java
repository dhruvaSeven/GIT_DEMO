package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before("@Regression")
	public void before_validation() {
		System.out.println("this is hook happening before regression");
	}
	
	@After("@Regression")
	public void after_validation() {
		System.out.println("this is hook happening after validation");
	}

}
