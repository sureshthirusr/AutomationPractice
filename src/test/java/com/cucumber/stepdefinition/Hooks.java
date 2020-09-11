package com.cucumber.stepdefinition;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
 
 @Before("@RegressionTest")
    public void beforeScenario(){
	 
        System.out.println("BEFORE:=======RegressionTest Scenario============ separate hook");
    } 
 
 @After("@RegressionTest")
    public void afterScenario(){
       System.out.println("AFTER:========RegressionTest Scenario============= separate hook");
    }
}