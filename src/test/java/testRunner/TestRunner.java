package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

		 
       // features= {".//Features//Login.feature"},
       // features= {".//Features//LoginDDT.feature"},
        features= {".//Features//LoginDDTExcel.feature"},
        //features = "@target/rerun.txt",
        glue="stepDefinition",
        plugin= {
        		"pretty", "html:reports/myreport.html", 
        		"json:reports/myreport.json",
        		"rerun:target/rerun.txt",
        		},    
        dryRun=false,
        monochrome=true
       // tags = "@sanity"	//Scenarios tagged with @sanity,
      )
public class TestRunner 
{

}

