package com.demo.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrarPage {

    WebDriver driver;

    public RegistrarPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "")
    private WebElement box;

    @FindBy(name = "")
    private WebElement box;

    @FindBy(name = "")
    private WebElement box;

    @FindBy(name = "")
    private WebElement box;

    @FindBy(name = "")
    private WebElement box;

    @FindBy(name = "")
    private WebElement box;

    @FindBy(name = "")
    private WebElement box;


}
