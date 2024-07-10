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

def clanNameEn = CustomKeywords.'esport.Utils.randomString'(5, 'String')

def clanNameAr = 'نادى ' + CustomKeywords.'esport.Utils.randomArabicString'(8)

WebUI.callTestCase(findTestCase('Web/TestLogin'), [('userEmail') : GlobalVariable.PLAYER_EMAIL, ('userPassword') : GlobalVariable.PLAYER_PASSWORD], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/span_Clans'))

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/span_Add New Clan'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_Add_Clan/input_Clan Name EN_clanNameEn'), clanNameEn)

WebUI.setText(findTestObject('Object Repository/Page_Esports_Add_Clan/input_Clan Name AR_clanNameAr'), clanNameAr)

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/input_text'))

WebUI.setText(findTestObject('Page_Esports_Add_Clan/input_text'), 'Apex')

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports_Add_Clan/span_Select Game_ng-arrow-wrapper'))
WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/div_Apex Legends'))

WebUI.focus(findTestObject('Page_Esports_Add_Clan/textarea_About_about'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_Add_Clan/textarea_About_about'), 'this is a clan')

WebUI.scrollToElement(findTestObject('Page_Esports_Add_Clan/i_Clan Members_icon-plus add-icon'), 0)

//WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/div_Clan Name ENClan Name ARGameSelect Game_553727'))
//WebUI.acceptAlert()
WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/i_Clan Members_icon-plus add-icon'))

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/div_Select Role_ng-input'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_Add_Clan/input_text_role'), 'content')

//WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports_Add_Clan/input_text'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/span_Content Creator'))

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/input_Add member email address or ID_email'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_Add_Clan/input_Add member email address or ID_email'), 'Auto_content@mailinator.com')

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/span_Add'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports_Add_Clan/span_Auto_contentmailinator.com'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports_Add_Clan/span_Content Creator_1'))

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/button_Save'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports_Add_Clan/button_Content Creator'))

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/button_Save_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Esports_Add_Clan/div_Clan Added Successfully'), 'Clan Added Successfully')

WebUI.setText(findTestObject('Page_Esports_Clans/input_Clans_form-control ng-untouched ng-pristine ng-valid'), clanNameEn)

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports_Add_Clan/h4_cccc'))

WebUI.scrollToElement(findTestObject('Page_Esports/mat-icon_arrow_drop_down'), 0)

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/mat-icon_arrow_drop_down'))

WebUI.click(findTestObject('Object Repository/Page_Esports_Add_Clan/a_Log out'))

WebUI.closeBrowser()

