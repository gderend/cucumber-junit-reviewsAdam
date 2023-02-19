package com.cydeo.step_definations;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before // it should be came form cucumber java NOT JUNIT
    public void setup(){
        System.out.println("SET UP BEFORE EACH SCENARIO");
    }
    @After // it should be came form cucumber java NOT JUNIT
    public void tearDown(){

        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }
}
