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

'Buka browser dan navigasi ke URL'
WebUI.openBrowser(GlobalVariable.loginUrl)

'Maximize window browser'
WebUI.maximizeWindow()

'Verifikasi Title Login terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/Label_LoginTitle'))

'Verifikasi Text Field username terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/TextArea_Username'))

'Verifikasi Text Field password terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/TextArea_Password'))

'Verifikasi Button login terlihat'
WebUI.verifyElementVisible(findTestObject('Login_Page/Button_Login'))

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

'Input username pada field'
WebUI.setText(findTestObject('Login_Page/TextArea_Username'), userName)

'Get attribute value yang sudah diinput pada field'
String username = WebUI.getAttribute(findTestObject('Login_Page/TextArea_Username'), 'value')

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

'Input password pada field'
String pass = WebUI.setText(findTestObject('Login_Page/TextArea_Password'), password)

'Get attribute value yang sudah diinput pada field'
WebUI.getAttribute(findTestObject('Login_Page/TextArea_Password'), 'value')

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

'Verifikasi button Login dapat diklik'
WebUI.verifyElementClickable(findTestObject('Login_Page/Button_Login'))

'Klik button Login'
WebUI.click(findTestObject('Login_Page/Button_Login'))

'Verifikasi title product pada product page tampil'
WebUI.verifyElementVisible(findTestObject('Product_Page/Label_TitleProducts'))

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

