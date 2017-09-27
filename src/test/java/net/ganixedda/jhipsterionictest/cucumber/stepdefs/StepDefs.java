package net.ganixedda.jhipsterionictest.cucumber.stepdefs;

import net.ganixedda.jhipsterionictest.JhipsterIonicTestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterIonicTestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
