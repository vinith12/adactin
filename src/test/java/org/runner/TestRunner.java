  package org.runner;

import org.adctin.JVMreport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",
         glue="org.adctin",dryRun=false ,monochrome=true, plugin= {"pretty",
        		 "html:src\\test\\resources\\Reports\\htmlrepo",
        		 "json:src\\test\\resources\\Reports\\jsonrep\\jsonda.json",
        		 "junit:src\\test\\resources\\Reports\\junitrep\\junitda.xml"}   )

// plugin= {"pretty:sample.txt"} ,plugin= {"pretty"}, plugin= {"usage"}, plugin= {"usage:gimp.txt"}
//  

public class TestRunner {
	@AfterClass
	public static void Jvmreport() {
		JVMreport.generateJVMrep("src\\test\\resources\\Reports\\jsonrep\\jsonda.json");
		System.out.println("report came man");
	}
	

}
