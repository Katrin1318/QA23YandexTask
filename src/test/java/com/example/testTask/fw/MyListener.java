package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyListener extends AbstractWebDriverEventListener {

    WebDriver wd;

    Logger logger = LoggerFactory.getLogger(MyListener.class);

    @Override
    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        logger.info("Start element --> " + by);
    }

    @Override
    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        logger.info("The element with locator --> " + by + " --> was found");
    }

    @Override
    public void onException(Throwable throwable, WebDriver driver) {
        logger.info(throwable.fillInStackTrace().toString());

        int index =  (int) (System.currentTimeMillis()/1000)%3600;
        String link = "Screenshots/screen" + index + "png.";
        logger.info("This is link of 'your screen' with error --> " + link);

        HelperBase base = new HelperBase(wd);
        base.takeScreenshot();
    }

    public MyListener() {
        super();


    }
}
