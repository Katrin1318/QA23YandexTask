package com.example.testTask.fw;

import com.example.testTask.model.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ItemHelper extends HelperBase{
    public ItemHelper(WebDriver wd) {
        super(wd);
    }

    public String getItemNameFromListByOrder(int number) {
        return wd.findElement(By.xpath("//*[@data-autotest-id='product-snippet'][" + number + "]//h3")).getText();
    }

    public void filterItem(Item item) {
        selectItem(item.getItemType());

        Actions actions = new Actions(wd);
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();

        type(By.id("glpricefrom"), item.getPriceFrom());
        type(By.id("glpriceto"), item.getPriceTo());
        click(By.xpath("//span[text()='" + item.getGetBrand() + "']"));
    }

    public void selectItem(String itemType) {
        click(By.cssSelector("[href='/catalog--" + itemType + "?how=dpop&glfilter=&cvredirect=3&filter-express-delivery=1&searchContext=express&track=srch_ddl']"));
    }
}
