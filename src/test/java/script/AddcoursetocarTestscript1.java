package script;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;
import pom.AddtoCart;
import pom.DemoLoginSkillrary;
import pom.SkillraryLoginPage;

public class AddcoursetocarTestscript1 extends BaseClass
{
	@Test
	public void TestCase1()
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gear();
		s.skillrarydemoapplication();
		
		//for Swithching the tab
		utilities.swithctabs(driver);
		DemoLoginSkillrary  d =new DemoLoginSkillrary(driver);
		//for mouse hover on coursebtn
		utilities.mousHover(driver, d.getCoursebtn());
		d.seleniumtraingtab();
		
		AddtoCart a = new AddtoCart(driver);
		utilities.doubleclick(driver,a.getAddbtn());
		a.addtocartbutton();
		utilities.alertPopup(driver);
		
	}
}
