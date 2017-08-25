package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends AbstractMehodsPages
{
	public CreateLeadPage()
	{
		PageFactory.initElements(eventdriver,this);
	}
	
	 @FindBy(how=How.ID, using="createLeadForm_companyName")
	WebElement companyName_ele;
	 public CreateLeadPage provideCompanyName()
	 {
		 enterData(companyName_ele,"comp001");
		 return this;
	 }
	 
	 @FindBy(how=How.ID, using="createLeadForm_firstName")
		WebElement firstName_ele;
	 public CreateLeadPage provideFirstName()
	 {
		 enterData(firstName_ele,"fname001");
		 return this;
	 }
	 @FindBy(how=How.ID, using="createLeadForm_lastName")
		WebElement lastName_ele;
	 public CreateLeadPage provideLastName()
	 {
		 enterData(lastName_ele,"lname001");
		 return this;
	 }
	 
	 @FindBy(how=How.ID, using="createLeadForm_dataSourceId")
		WebElement dataSourceSelect_ele;
	 public CreateLeadPage selectSourceID()
	 {
		 enterData(dataSourceSelect_ele,"LEAD_CONFERENCE");
		 return this;
	 }
	 
	 @FindBy(how=How.ID, using="createLeadForm_marketingCampaignId")
		WebElement marketingCampaignIdSelect_ele;
	 public CreateLeadPage selectMarketingCampaignID()
	 {
		 enterData(marketingCampaignIdSelect_ele,"CATRQ_CARNDRIVER");
		 return this;
	 }
	 
	 
	 @FindBy(how=How.ID, using="createLeadForm_primaryPhoneNumber")
		WebElement primaryPhoneNumber_ele;
	 public CreateLeadPage providePrimaryPhoneNumber()
	 {
		 enterData(primaryPhoneNumber_ele,"876767755");
		 return this;
	 }
	 
	 @FindBy(how=How.ID, using="createLeadForm_primaryEmail")
		WebElement primaryEmail_ele;
	 public CreateLeadPage providePrimaryEmail()
	 {
		 enterData(primaryEmail_ele,"test@test.com");
		 return this;
	 }
	 
	 
	 @FindBy(how=How.CLASS_NAME, using="smallSubmit")
		WebElement submit_ele;
	 public ViewLeadPage clickSubmit()
	 {
		 click(submit_ele);
		 return new ViewLeadPage();
	 }
	 
	
}