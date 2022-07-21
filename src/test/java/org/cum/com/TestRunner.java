package org.cum.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "F:\\MS-Office 2007\\Private\\eclipse\\CumcumberJunit\\src\\test\\resources\\Features",
                  glue = "F:\\MS-Office 2007\\Private\\eclipse\\CumcumberJunit\\src\\test\\java\\org\\cum\\com",
                  plugin = "html:target",
                  monochrome=true,
                  dryRun=true,
                  tags = {"~@mobile","@smoke,@sanity"})
                  
public class TestRunner {

}
