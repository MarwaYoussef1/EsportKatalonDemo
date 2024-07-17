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
import esport.Utils as Utils
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths
import java.nio.file.*

//def userDir = System.getProperty('user.dir')
String relativePath = 'Uploads/SignUpPdf.pdf'

String relativePathLogo = 'Uploads/content.png'



// Get the absolute path using the project directory
String katTestFilePath = RunConfiguration.getProjectDir() + "/" + relativePath

String katTestFilePathLogo = RunConfiguration.getProjectDir() + "/" + relativePathLogo

/*Path projectPath = Paths.get(RunConfiguration.getProjectDir())

Path katTestFile = projectPath.resolve('Data Files').resolve(relativePath)

Path KatTestLogo = projectPath.resolve('Data Files').resolve(relativePathLogo)

File filetest = new File(katTestFile.toString())

File fileLogo = new File(KatTestLogo.toString())

def found = filetest.exists()

def foundLogo = fileLogo.exists()

def katTestFilePath = filetest.getAbsolutePath()

def katTestFilePathLogo = fileLogo.getAbsolutePath()

println("katTestFile : $katTestFilePath")

println("Files.exists(katTestFile) : $found")

println("katTestFileLogo : $katTestFilePathLogo")

println("Files.exists(katTestFileLogo) : $foundLogo")*/

def userName = CustomKeywords.'esport.Utils.randomString'(5, 'String')

def mobileNum = '56' + CustomKeywords.'esport.Utils.randomString'(7, 'num')

String userEmail = CustomKeywords.'esport.Utils.randomEmail'(GlobalVariable.DOMAIN_MAIL)

def userEmailMailinator = userEmail.split('@')[0]

def nationalId = CustomKeywords.'esport.Utils.randomString'(5, 'num')

def clubNameEn = CustomKeywords.'esport.Utils.randomString'(5, 'String')

def clubNameAr = 'نادى ' + CustomKeywords.'esport.Utils.randomArabicString'(8)

def crNumber = CustomKeywords.'esport.Utils.randomString'(10, 'num')

def iban = 'SA' + CustomKeywords.'esport.Utils.randomString'(22, 'num')

WebUI.openBrowser(GlobalVariable.HOME_URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/button_Login'))

WebUI.scrollToElement(findTestObject('Page_Sign in to - Saudi Esports Federation/button_Create New Account'), 0)

WebUI.click(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/button_Create New Account'))

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/span_Individuals_mat-radio-container'))

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/div_Please select your role_ng-input'))

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/div_Club Owner'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__name'), userName)

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__email'), userEmail)

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input_Code_mobileNumber'), mobileNum)

WebUI.scrollToElement(findTestObject('Page_Esports_SignUp_ClubOwner/button_Continue'), 0)

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/button_Continue'))

WebUI.waitForElementClickable(findTestObject('Page_Esports_SignUp_ClubOwner/span_Choose Nationality_ng-arrow-wrapper'), 
    0)

WebUI.enhancedClick(findTestObject('Page_Esports_SignUp_ClubOwner/span_Choose Nationality_ng-arrow-wrapper'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input_text'), 'saud')

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/div_Saudi'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__new-nationalId'), nationalId)

WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/input_nationalIdFile'), katTestFilePath)

//WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/input_nationalIdFile'), (userDir + GlobalVariable.UPLOAD_FILES_DIR) + 
// national_id_file_name)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/div_SignUpPdf.pdf'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__clubName'), clubNameEn)

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__clubNameAr'), clubNameAr)

WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/club_Logo'), katTestFilePathLogo)

//WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/club_Logo'), (userDir + GlobalVariable.UPLOAD_FILES_DIR) + 
//club_logo_file_name)
WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/div_jpgImage.jpg'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__crNumber'), crNumber)

WebUI.scrollToElement(findTestObject('Page_Esports_SignUp_ClubOwner/button_Sign up'), 0)

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__form-control hijriInput ng-untouched_f6813e'))

WebUI.selectOptionByValue(findTestObject('Page_Esports_SignUp_ClubOwner/select_144514461447144814491450145114521453_d97e46'), 
    '1446', true)

WebUI.click(findTestObject('Page_Esports_SignUp_ClubOwner/div_22'))

WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/input_crFile'), katTestFilePath)

//WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/input_crFile'), (userDir + GlobalVariable.UPLOAD_FILES_DIR) + 
// cr_file_name)
WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__new-clubIban'), iban)

WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/input_clubIbanFile'), katTestFilePath)

WebUI.scrollToElement(findTestObject('Page_Esports_SignUp_ClubOwner/button_Sign up'), 0)

//WebUI.uploadFile(findTestObject('Page_Esports_SignUp_ClubOwner/input_clubIbanFile'), (userDir + GlobalVariable.UPLOAD_FILES_DIR) + 
//    club_iban_file_name)
WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__new-password'), user_password)

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input__new-confirmPassword'), user_password)

WebUI.scrollToElement(findTestObject('Page_Esports_SignUp_ClubOwner/button_Sign up'), 0)

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/span__mat-checkbox-inner-container'))

WebUI.waitForElementClickable(findTestObject('Page_Esports_SignUp_ClubOwner/button_Sign up'), 5)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/button_Sign up'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/button_Submit application'))

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input_Mobile Verification_firstInput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input_Mobile Verification_secondInput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input_Mobile Verification_thirdInput'), '1')

WebUI.setText(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/input_Mobile Verification_fourthInput'), '1')

WebUI.scrollToElement(findTestObject('Page_Esports/button_Verify'), 0)

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_Esports_SignUp_ClubOwner/button_Ok'))

WebUI.closeBrowser()

/*WebUI.openBrowser(GlobalVariable.HOME_URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Esports/button_Login'))

WebUI.waitForElementVisible(findTestObject('Page_Sign in to - Saudi Esports Federation/input__email'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__email'), userEmail)

WebUI.delay(10)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__password'), user_password)

WebUI.delay(10)

WebUI.click(findTestObject('Page_Sign in to - Saudi Esports Federation/input__login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Esports/accountName'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Esports/p_Your Account Request Still Pending'), 'Your Account Request Still Pending')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports/mat-icon_arrow_drop_down'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Esports/a_Log out'), 5)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports/a_Log out'))

/*CustomKeywords.'esport.Browser.openURLInNewTab'(GlobalVariable.FAKE_MAIL_URL + userEmailMailinator)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Mailinator/td_RQ000001885 Your request has been received -'))

WebUI.click(findTestObject('Object Repository/Page_Mailinator/td_RQ000001885 Your request has been received -'))

WebUI.click(findTestObject('Object Repository/Page_Mailinator/a_click here'))

WebUI.switchToWindowIndex(2)

WebUI.waitForElementVisible(findTestObject('Page_Sign in to - Saudi Esports Federation/input__email'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__email'), userEmail)

WebUI.setText(findTestObject('Object Repository/Page_Sign in to - Saudi Esports Federation/input__password'), user_password)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Esports/p_Your Account Request Still Pending'), 'Your Account Request Still Pending')

WebUI.click(findTestObject('Object Repository/Page_Esports/mat-icon_arrow_drop_down'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Esports/a_Log out'))*/
//WebUI.closeBrowser()*/

