package MyProject.Test;

import org.testng.annotations.Test;

import PageFactory.LoginPage;
import Wrapper.CommonMethods;
import Wrapper.useAnnotations;

public class Case001 extends useAnnotations
{
																																																																																																																																																																																														
	@Test
	public void login()
	{
		new LoginPage()
		.provideUserName()
		.providePassword()
		.clickLogin()
		.clickCRMLink()
		.clickCreateLead()
		.provideFirstName()
		.provideLastName()
		.provideCompanyName()
		.providePrimaryEmail()
		.providePrimaryPhoneNumber()
		.selectMarketingCampaignID()
		.selectSourceID()
		.clickSubmit()
		.validateLeadID();
		
	}
	
/*	@DataProvider
	public void pushData()
	{
		Object value[][]=new Object[1][8];
		value[0][0]="uname111";
		value[0][1]="pwd111";
		value[0][2]="fname111";
		value[0][3]="lname111";
		value[0][4]="compname111";
		value[0][5]="mail@test.com111";
		value[0][6]="87867675111";
		value[0][7]="CATRQ_CARNDRIVER";
		value[0][8]="LEAD_CONFERENCE";
		
		value[1][0]="uname222";
		value[1][1]="pwd222";
		value[1][2]="fname222";
		value[1][3]="lname222";
		value[1][4]="compname222";
		value[1][5]="mail@test.com222";
		value[1][6]="87867675222";
		value[1][7]="CATRQ_CARNDRIVER";
		value[1][8]="LEAD_CONFERENCE";
	}*/
}