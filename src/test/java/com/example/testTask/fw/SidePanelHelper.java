package com.example.testTask.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SidePanelHelper extends HelperBase{
    public SidePanelHelper(WebDriver wd) {
        super(wd);
    }

    public void selectDepartmentType(String depType) {
        click(By.cssSelector("[href='/catalog--" + depType + "/list?filter-express-delivery=1&searchContext=express'] "));
    }
}
