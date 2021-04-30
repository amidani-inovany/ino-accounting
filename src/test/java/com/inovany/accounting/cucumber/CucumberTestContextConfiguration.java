package com.inovany.accounting.cucumber;

import com.inovany.accounting.InoAccountingApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = InoAccountingApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
