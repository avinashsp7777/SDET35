package com.com.assignments;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.crm.comcast.genericUtilities.BaseClass;
import com.crm.objectRepository.CreateNewOrganizationPage;
import com.crm.objectRepository.HomePage;
import com.crm.objectRepository.OrganizationInfoPage;
import com.crm.objectRepository.OrganizationInformationPage;
import com.crm.objectRepository.OrganizationPage;
//@Listeners(com.crm.comcast.genericUtilities.ItestListenerImplementation.class)
public class CreateOrganizationAndVerifyTest extends BaseClass{
	@Test
	public void createOrganizationAndVerifyTest() throws Throwable {
				
		//generate random number
		int randnum = jLib.getRandomNumber();

		//fetching data from excel
		String OrgName = eLib.getTestDataFromExcel("CreateOrganisation", 1, 2)+randnum;
		String industryName= eLib.getTestDataFromExcel("CreateOrganisation", 14, 4);
		String orgType=eLib.getTestDataFromExcel("CreateOrganisation", 4, 5);
		String phoneNum=eLib.getTestDataFromExcel("CreateOrganisation", 1, 6);

		//click on Organizations major tab
		HomePage hPage=new HomePage(driver);
		hPage.clickOnOrgLnk();
		//click on create Organization button
		OrganizationPage oPage=new OrganizationPage(driver);
		oPage.clickOnCreateOrgLkp();
		//enter organization name
		CreateNewOrganizationPage cNewOrgPage=new CreateNewOrganizationPage(driver);
		cNewOrgPage.enterOrgInfo(OrgName);
		//select industry name
		cNewOrgPage.selectIndustryFromDD(industryName);
		//select organization type
		cNewOrgPage.selectOrgTypeFromDD(orgType);
		//select organization assigned to radio button
		cNewOrgPage.selectOrgAssignedToRadioBtn();
		//enter phone number
		cNewOrgPage.enterPhoneNum(phoneNum);
		//click on save button
		cNewOrgPage.saveBtn();
		//get the text of organization created
		OrganizationInfoPage oInfoPage=new OrganizationInfoPage(driver);
		String orgTitleForVeri = oInfoPage.organizationTitle();
		//verification
		Assert.assertTrue(orgTitleForVeri.contains(OrgName));
		System.out.println("CreateOrganizationAndVerifyTEST is pass");
	}
}