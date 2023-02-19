package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeamlessLoginPage {

    public SeamlessLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id ="user")
    public WebElement usernameBox;

    @FindBy(id ="password")
    public WebElement passwordBox;

    @FindBy(id="submit-form")
    public WebElement loginButton;


}
