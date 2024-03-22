package com.sprint2_Sample.pages;

import com.sprint2_Sample.utilities.ConfigurationReader;
import com.sprint2_Sample.utilities.Driver;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {
public MessagePage(){
    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(id = "microoPostFormLHE_blogPostForm")
public WebElement messageClick;


@FindBy( xpath = "//span[@title='Link']")
public WebElement linkButton;

@FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-text']")
    public WebElement text;

@FindBy(xpath = "//input[@id='linkidPostFormLHE_blogPostForm-href']")
    public WebElement link;

@FindBy(xpath = "//input[@class='adm-btn-save']")
public WebElement saveBtn;

@FindBy(xpath = "//button[@id='blog-submit-button-save']")
public WebElement sendBtn;



}
