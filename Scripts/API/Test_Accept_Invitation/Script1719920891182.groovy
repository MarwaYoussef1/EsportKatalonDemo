import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('API/Test_Add_Team'), [:], FailureHandling.STOP_ON_FAILURE)

println('Club_Access_token= ' + GlobalVariable.API_ACCESS_TOKEN)
WS.sendRequestAndVerify(findTestObject('APIServices/Esport-login/Login', [('userEmail') : GlobalVariable.PLAYER_EMAIL, ('password') : GlobalVariable.PLAYER_PASSWORD
            , ('home_url') : GlobalVariable.HOME_URL]))

println('player_Access_token= ' + GlobalVariable.API_ACCESS_TOKEN)

response = WS.sendRequestAndVerify(findTestObject('APIServices/Esport-Teams/GET_ Invitation_List', [('token') : GlobalVariable.API_ACCESS_TOKEN
            , ('home_url') : GlobalVariable.HOME_URL]))

invitation_id = WS.getElementPropertyValue(response, 'content[0].systemId')

WS.sendRequestAndVerify(findTestObject('APIServices/Esport-Teams/Accept Invitation', [('token') : GlobalVariable.API_ACCESS_TOKEN
            , ('home_url') : GlobalVariable.HOME_URL, ('invitation_system_id') : invitation_id]))

