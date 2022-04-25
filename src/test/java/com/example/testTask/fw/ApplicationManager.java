package com.example.testTask.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    WebDriver wd;

    MainPageHelper mainPage;
    HeaderHelper header;
    SidePanelHelper sidePanel;
    ItemHelper itemHelper;

    public MainPageHelper getMainPage() {
        return mainPage;
    }

    public HeaderHelper getHeader() {
        return header;
    }

    public SidePanelHelper getSidePanel() {
        return sidePanel;
    }

    public ItemHelper getItemHelper() {
        return itemHelper;
    }

    public void init() {
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.navigate().to("https://yandex.ru/");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        mainPage = new MainPageHelper(wd);
        header = new HeaderHelper(wd);
        sidePanel = new SidePanelHelper(wd);
        itemHelper = new ItemHelper(wd);
    }

    public void stop() {
        wd.quit();
    }


}
