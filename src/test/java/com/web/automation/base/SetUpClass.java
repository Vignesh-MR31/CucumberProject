package com.web.automation.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SetUpClass {
	Base base;
 
    public SetUpClass(Base base) {
        this.base = base;
    }
 
    @Before
    public void setup() {
    	base.setupController();
    }
 
    @After
    public void teardown() {
    	base.teardownController();
    }
}
