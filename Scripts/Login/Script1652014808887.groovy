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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://twitter.com/')

WebUI.click(findTestObject('Object Repository/login/Page_Twitter. Its whats happening  Twitter/div_Sign in'))

WebUI.click(findTestObject('Object Repository/login/Page_Twitter/div_Phone, email, or username_css-1dbjc4n r_655147'))

WebUI.setText(findTestObject('Object Repository/login/Page_Twitter/input_Phone, email, or username_text'), 'darylaa')

WebUI.click(findTestObject('Object Repository/login/Page_Twitter/div_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/login/Page_Twitter/input_Password_password'), 'sWRHBiqTjdz2bz8j4SH8ew==')

WebUI.click(findTestObject('Object Repository/login/Page_Twitter/div_Log in'))

WebUI.click(findTestObject('Object Repository/login/Page_Home  Twitter/svg_View keyboard shortcuts_r-1nao33i r-4qt_3b22c9'))

WebUI.click(findTestObject('Object Repository/login/Page_Explore  Twitter/svg_Notifications_r-1nao33i r-4qtqp9 r-yyyy_34fb19'))

WebUI.click(findTestObject('Object Repository/login/Page_(2) Notifications  Twitter/path'))

WebUI.click(findTestObject('Object Repository/login/Page_Messages  Twitter/path'))

WebUI.click(findTestObject('Object Repository/login/Page_d (Darylaa)  Twitter/div_View keyboard shortcuts_css-1dbjc4n r-1_56d713'))

