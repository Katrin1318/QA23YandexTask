package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void waitTime(int millis) throws InterruptedException {
        Thread.sleep(millis);
    }

    public void type(By locator, String text) {
        if (text !=null) {
            click(locator);
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void acceptCookies() {
        click(By.cssSelector("[data-id='button-all']"));
    }

    public void switchToNextTab(int number) {
        List<String> availableWindows = new ArrayList<>(wd.getWindowHandles());
        if (!availableWindows.isEmpty()) {
            wd.switchTo().window(availableWindows.get(number));
        }
    }

    public void click(By by) {
        wd.findElement(by).click();
    }
}
