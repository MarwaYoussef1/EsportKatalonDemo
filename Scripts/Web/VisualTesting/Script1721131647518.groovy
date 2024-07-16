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

WebUI.openBrowser(GlobalVariable.HOME_URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Login'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__email'), GlobalVariable.CLUB_OWNER_EMAIL)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__password'), GlobalVariable.CLUB_OWNER_PASSWROD)

WebUI.click(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__login'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Esports/span_Invitations'))

WebUI.click(findTestObject('Object Repository/Page_Esports/span_automation player account asked to joi_c179f0'))

WebUI.delay(10)

WebUI.takeScreenshotAsCheckpoint('invitations screen')
WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports/mat-icon_arrow_drop_down'))
WebUI.click(findTestObject('Object Repository/Page_Esports/a_Log out'))

WebUI.closeBrowser()
