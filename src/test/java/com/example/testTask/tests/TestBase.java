package com.example.testTask.tests;

import com.example.testTask.fw.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        app.init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
