package com.example.testTask.tests;

import com.example.testTask.model.Item;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchItemTest() throws InterruptedException {
        app.getMainPage().clickOnMarketTab();
        app.getHeader().switchToNextTab(1);
        app.getHeader().selectExpressDepartment();
        //app.getHeader().acceptCookies();

        app.getSidePanel().selectDepartmentType("elektronika/23282330");
        app.getHeader().acceptCookies();
        app.getItemHelper().waitTime(2000);
        app.getItemHelper().filterItem(new Item().setItemType("smartfony-i-aksessuary/23282379")
                .setPriceFrom("20000")
                .setPriceTo("35000")
                .setGetBrand("Apple"));
        app.getItemHelper().waitTime(2000);
        String itemName = app.getItemHelper().getItemNameFromListByOrder(2);
        //System.out.println(itemName);

        app.getHeader().typeItemNameInSearchInputField(itemName);
        app.getSidePanel().waitTime(2000);
        String foundItemName = app.getItemHelper().getItemNameFromListByOrder(1);
        app.getSidePanel().waitTime(2000);
        Assert.assertEquals(foundItemName,itemName);
    }


}
