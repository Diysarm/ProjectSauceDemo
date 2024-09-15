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

'Verifikasi element Title Swag Labs terlihat'
WebUI.verifyElementVisible(findTestObject('Global_Header/Label_Title'))

'Verifikasi Element button Cart Terlihat'
WebUI.verifyElementVisible(findTestObject('Global_Header/Button_Cart'))

'Verifikasi button Cart dapat diklik'
WebUI.verifyElementClickable(findTestObject('Global_Header/Button_Cart'))

'Verifikasi Button Burger terlihat'
WebUI.verifyElementVisible(findTestObject('Global_Header/Button_BurgerMenu'))

'Verifikasi Button Burger dapat diklik'
WebUI.verifyElementClickable(findTestObject('Global_Header/Button_BurgerMenu'))

'Verifikasi button Cart terlihat'
WebUI.verifyElementVisible(findTestObject('Global_Header/Button_Cart'))

'Verifikasi button Cart dapat diklik'
WebUI.verifyElementClickable(findTestObject('Global_Header/Button_Cart'))

'Klik button Cart'
WebUI.click(findTestObject('Global_Header/Button_Cart'))

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

'Verifikasi bahwa product count dengan product yang ada di cart sudah sesuai'
CustomKeywords.'packaged.verifyproduct.verifyProductCountCart'()

'Verifikasi button checkout terlihat'
WebUI.verifyElementVisible(findTestObject('Cart_Page/Button_Checkout'))

'Verifikasi button checkout dapat diklik'
WebUI.verifyElementClickable(findTestObject('Cart_Page/Button_Checkout'))

'Klik button checkout'
WebUI.click(findTestObject('Cart_Page/Button_Checkout'))

