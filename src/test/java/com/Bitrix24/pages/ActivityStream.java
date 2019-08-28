package com.Bitrix24.pages;

import com.Bitrix24.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStream {

    public ActivityStream()
    {
        PageFactory.initElements(Driver.get(),this);


    }

    public WebElement homeToolBar(String tab) {
        String xpath = "//span[contains(text(),'" + tab + "')]";
        return Driver.get().findElement(By.xpath(xpath));
    }

    @FindBy (xpath = "//input[@class='login-inp']")
    public  WebElement loginBar;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordBar;

    @FindBy(xpath = "//input[@type= 'submit']")
    public WebElement loginButton;
}
