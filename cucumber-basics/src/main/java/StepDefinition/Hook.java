package StepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

@Before
public void initialize(){
	
	System.out.println("The test starts!");
}

@After
public void cleanup(){
	System.out.println("The test just finished!");
}
}
