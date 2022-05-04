package com.example.testTask.fw;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

    //WebDriver wd;
    EventFiringWebDriver wd;

    MainPageHelper mainPage;
    HeaderHelper header;
    SidePanelHelper sidePanel;
    ItemHelper itemHelper;

    String browser;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

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
        if (browser.equals(BrowserType.CHROME)) {
            wd = new EventFiringWebDriver(new ChromeDriver());
        } else if (browser.equals(BrowserType.FIREFOX)){
            wd = new EventFiringWebDriver(new FirefoxDriver());
        }
        wd.manage().window().maximize();
        wd.navigate().to("https://yandex.ru/");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        mainPage = new MainPageHelper(wd);
        header = new HeaderHelper(wd);
        sidePanel = new SidePanelHelper(wd);
        itemHelper = new ItemHelper(wd);

        wd.register(new MyListener());
    }

    public void stop() {
        wd.quit();
    }


}
