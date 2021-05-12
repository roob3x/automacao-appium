package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/robertofilho/IdeaProjects/automacao-appium/src/test/resources",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Rob",
        glue = {"stepDefinition"},
        plugin =


                "pretty"
        ,
        //strict = true,dryRun = true
        monochrome = true)
public class TestRunner {
    //"+1-555-521-5554"
}
