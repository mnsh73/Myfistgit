package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage 
{
	@FindBy(xpath=" //a[text()= ' GEARS ']") private WebElement gearsbtn;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]") private WebElement skillrarydemoapp;
	

	public WebElement getGearsbtn() {
		return gearsbtn;
	}

	public WebElement getSkillrarydemoapp() {
		return skillrarydemoapp;
	}

	public SkillraryLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void gear()
	{
		gearsbtn.click();
	}
	public void skillrarydemoapplication()
	{
		skillrarydemoapp.click();
	}
	
}
