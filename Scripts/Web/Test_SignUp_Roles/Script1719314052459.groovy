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

def userName = CustomKeywords.'esport.Utils.randomString'(5, 'String')

def mobileNum = '56' + CustomKeywords.'esport.Utils.randomString'(7, 'num')

def userEmail = CustomKeywords.'esport.Utils.randomEmail'(GlobalVariable.DOMAIN_MAIL)

WebUI.openBrowser(GlobalVariable.HOME_URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/button_Create New Account'))

WebUI.enhancedClick(findTestObject('Page_Esports/role_type_radio_button', [('roleType') : roleType]))

WebUI.click(findTestObject('Object Repository/Page_Esports/div_Please select your role_ng-input'))

WebUI.enhancedClick(findTestObject('Page_Esports/role_option', [('role') : role]))

WebUI.setText(findTestObject('Object Repository/Page_Esports/input__pcrName'), userName)

WebUI.setText(findTestObject('Object Repository/Page_Esports/input__pcrEmail'), userEmail)

WebUI.setText(findTestObject('Object Repository/Page_Esports/input_Code_pcrMobileNumber'), mobileNum)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports/span_Male_mat-radio-outer-circle'))

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Esports/span_Choose Nationality_ng-arrow-wrapper'))

WebUI.setText(findTestObject('Object Repository/Page_Esports/input_Clans_form-control ng-untouched ng-pr_6c0b8e'), 'sau')

WebUI.click(findTestObject('Object Repository/Page_Esports/div_Saudi'))

/*WebUI.click(findTestObject('Object Repository/Page_Esports/svg_Date of birth_mat-datepicker-toggle-def_7c2da6'))

WebUI.click(findTestObject('Object Repository/Page_Esports/button_JUN 2024_mat-focus-indicator mat-cal_c94f0a'))

WebUI.click(findTestObject('Object Repository/Page_Esports/div_30'))*/
WebUI.click(findTestObject('Object Repository/Page_Esports/input_Date of birth_new-purchaseDate'))

WebUI.click(findTestObject('Object Repository/Page_Esports/polygon'))

WebUI.click(findTestObject('Object Repository/Page_Esports/div_2001'))

WebUI.click(findTestObject('Object Repository/Page_Esports/div_JUN'))

WebUI.click(findTestObject('Object Repository/Page_Esports/div_26'))

WebUI.setText(findTestObject('Object Repository/Page_Esports/input__new-password'), user_password)

WebUI.setText(findTestObject('Object Repository/Page_Esports/input__new-confirmPassword'), user_password)

WebUI.click(findTestObject('Object Repository/Page_Esports/span__mat-checkbox-inner-container'))

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Sign up'))

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Submit application'))

WebUI.setText(findTestObject('Object Repository/Page_Esports/input_Mobile Verification_firstInput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Esports/input_Mobile Verification_secondInput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Esports/input_Mobile Verification_thirdInput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Esports/input_Mobile Verification_fourthInput'), '1')

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Esports/button_Get Started'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__email'), userEmail)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__password'), user_password)

WebUI.click(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__login'))

//WebUI.verifyElementText(findTestObject('Object Repository/Page_Esports/username_Title'), userName)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports/div_Account_Name'))

WebUI.delay(5)
WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports/mat-icon_arrow_drop_down'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports/a_Log out'))

WebUI.closeBrowser()

