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

'Verifikasi label checkout terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Complete_Page/Label_CheckoutComplete'))

'Verifikasi Image terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Complete_Page/Image_CheckoutSuccess'))

'Verifikasi label thankyou terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Complete_Page/Label_Thankyou'))

'Verifikasi label your order dispatched terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Complete_Page/Label_YourOrderDispatched'))

'Verifikasi Buton Back Home terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Complete_Page/Button_BackHome'))

'Verifikasi button Back Home dapat diklik'
WebUI.verifyElementClickable(findTestObject('Checkout_Complete_Page/Button_BackHome'))

'Klik button Back home'
WebUI.click(findTestObject('Checkout_Complete_Page/Button_BackHome'))

'Verifikasi label title produk terlihat setelah klik back home'
WebUI.verifyElementVisible(findTestObject('Product_Page/Label_TitleProducts'))

