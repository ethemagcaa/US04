//package Pages;
//
//import Utilities.WD;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//
//public class US_04_DialogContent_Ethem extends Parent{
//    public US_04_DialogContent_Ethem(){PageFactory.initElements(WD.getDriver(),this);}
//
//    @FindBy(xpath = "(//span[text()='Setup'])[1]")
//    public WebElement setup;
//
//    @FindBy(xpath = "//span[text()='Parameters']")
//    public WebElement setupParameters;
//    @FindBy(xpath = "//span[text()='Fields']")
//    public WebElement fields;
//    @FindBy(xpath = "//ms-add-button[@tooltip='GENERAL.BUTTON.ADD']")
//    public WebElement plusbutton;
//
//    @FindBy(xpath = "//ms-text-field[@class='ng-tns-c2794762957-165 floating time-field-floating ng-valid ng-touched ng-dirty']")
//    public WebElement nameinput;
//    @FindBy(xpath = "//*[@class='mat-form-field-wrapper ng-tns-c2794762957-149']\n")
//    public WebElement codeinput;
//    @FindBy(id = "mat-select-value-13")
//    public WebElement text;
//    @FindBy(xpath = "(//input[@type='text'])[1]")
//    public WebElement searchname;
//    @FindBy(xpath = "(//input[@type='text'])[2]")
//    public WebElement searchcode;
//    @FindBy(xpath = "//span[text()='Search']")
//    public WebElement searchbutton;
//
//    @FindBy(xpath = "//button[@color='warn']")
//    public WebElement deleteInput;
//
//    @FindBy(xpath = "//button[@type='submit']")
//    public WebElement deletebutton;
//
//    public WebElement getWebElement(String strElement)
//    {
//        switch (strElement)
//        {
//            case "setup": return this.setup;
//            case "setupParameters": return this.setupParameters;
//            case "fields": return this.fields;
//            case "plusbutton": return this.plusbutton;
//            case "nameinput": return this.nameinput;
//            case "codeinput": return this.codeinput;
//            case "searchname": return this.searchname;
//            case "searchcode": return this.searchcode;
//            case "searchbutton": return this.searchbutton;
//            case "deleteInput": return this.deleteInput;
//            case "deletebutton": return this.deletebutton;
//            case "text": return this.text;
//        }
//        return null;
//    }
//}
