package com.ClearTrip;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookTicket extends BaseMain {

    public BookTicket() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='OneWay']")
    private WebElement ClickOneWay;

    @FindBy(xpath = "//input[@id='FromTag']")
    private WebElement From;

@FindBy(xpath = "//input[@id='ToTag']")
private WebElement To;

@FindBy(xpath = "//div[contains(@class,'searchForm clearFix')]//div[1]//dl[1]//dd[1]//div[1]//a[1]//i[1]")
private WebElement ClickCalendar;
    @FindBy(xpath = "//div[contains(@class,'monthBlock last')]//tr[5]//td[5]")
    private WebElement EnterDate;


    @FindBy(xpath = "//select[@id='Adults']")
    private WebElement ClickAdult;
    @FindBy(xpath = "//select[@id='Adults']//option[contains(text(),'3')]")
    private WebElement Add3Adults;

    @FindBy(xpath = "//select[@id='Childrens']")
    private WebElement ClickChild;
    @FindBy(xpath = "//select[@id='Childrens']//option[contains(text(),'1')]")
    private WebElement Add1Child;

    @FindBy(xpath = "//select[@id='Infants']")
    private WebElement ClickInfant;
    @FindBy(xpath = "//select[@id='Infants']//option[contains(text(),'3')]")
    private WebElement AddInfant;

    @FindBy(xpath = "//a[@id='MoreOptionsLink']")
    private WebElement ClickMoreOption;
    @FindBy(xpath = "//select[@id='Class']")
    private WebElement SelectTravelClass;
    @FindBy(xpath = "//input[@id='AirlineAutocomplete']")
    private WebElement TypePreferredline;
    @FindBy(xpath = "//input[@id='SearchBtn']")
    private WebElement ClicksearchBox;







    public void Naviage(){
driver.get("https://www.cleartrip.com/?dxid=EAIaIQobChMIpsT7l_Do5wIVy7TtCh3GjAA1EAAYASAAEgLufvD_BwE&gclid=EAIaIQobChMIpsT7l_Do5wIVy7TtCh3GjAA1EAAYASAAEgLufvD_BwE");
    }

public void Verify_checkbox(){
ClickOneWay.click();
    }

    public void EnterDestination(){
From.sendKeys("London");
To.sendKeys("chennai");
    }

    public void  EnterDate(){
        ClickCalendar.click();
EnterDate.click();
    }

    public void AddPeople (){
ClickAdult.click();
Add3Adults.click();
ClickChild.click();
Add1Child.click();
ClickInfant.click();
AddInfant.click();

    }

    public void  GiveRefrence(){
ClickMoreOption.click();
    }
public void SelectEconomy(){
        SelectTravelClass.click();
}
    public void  TypeAirline(){
TypePreferredline.sendKeys("Ethihad");
    }

    public void ClickSearchFlight (){
ClicksearchBox.click();
    }

}
