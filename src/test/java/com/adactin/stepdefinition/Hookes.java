package com.adactin.stepdefinition;

import java.io.IOException;

import com.framework.org.CucumberFramework.Baseclass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes extends Baseclass {
@Before
public static void beforehookes(Scenario scenario) {
	String name= scenario.getName();
	System.out.println(name);

}
@After
public static void afterhookes(Scenario scenario) throws IOException {
	String status=scenario.getStatus();
	System.out.println(status);
	if(scenario.isFailed()) {
		
screenshot("failedscenario");

}
}
}
