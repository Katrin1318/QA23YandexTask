package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPageHelper extends HelperBase{
    public MainPageHelper(WebDriver wd) {
        super(wd);
    }

    public void clickOnMarketTab() {
        click(By.cssSelector("[data-id='market']"));
    }
}
