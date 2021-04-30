package com.inovany.accounting.cucumber;

import com.inovany.accounting.AbstractNeo4jIT;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/features")
@ExtendWith(AbstractNeo4jIT)
class CucumberIT {}
