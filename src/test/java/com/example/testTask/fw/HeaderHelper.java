package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper extends HelperBase{
    public HeaderHelper(WebDriver wd) {
        super(wd);
    }

    public void typeItemNameInSearchInputField(String itemName) {
        type(By.id("header-search"), itemName);
        click(By.cssSelector("[data-r='search-button']"));
    }

    public void selectExpressDepartment() {
        click(By.xpath("//span[text()='Экспресс']"));
    }
}
