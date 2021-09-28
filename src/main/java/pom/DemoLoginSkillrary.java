package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginSkillrary 
{
	@FindBy (id="course") private WebElement coursebtn;
	@FindBy(xpath= "//a[text()='Selenium Training']") private WebElement seleniumtrainingtb;
	@FindBy(id="add") private WebElement addbtn;
	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	public WebElement getSeleniumtrainingtb() {
		return seleniumtrainingtb;
	}
	
	public WebElement getAddbtn() {
		return addbtn;
	}
	public DemoLoginSkillrary(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void seleniumtraingtab()
	{
		seleniumtrainingtb.click();
	}
	

}
