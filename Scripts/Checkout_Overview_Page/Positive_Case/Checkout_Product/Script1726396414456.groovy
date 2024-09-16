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

'Verifikasi element title checkout overview terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Overview_Page/Label_CheckoutOverview'))

'Mengambil screenshot window'
WebUI.takeScreenshot()

'Verifikasi harga produk dengan harga total + tax sudah sesuai'
CustomKeywords.'product.verifyproduct.verifyProductPrice'()

'Verifikasi quantity barang yang dicheckout sudah sesuai'
CustomKeywords.'product.verifyproduct.verifyProductCountCart'()

'Scroll window ke element Item Total'
WebUI.scrollToElement(findTestObject('Checkout_Overview_Page/Label_SubTotalProductPrice'), 0)

'Mengambil screenshot window'
WebUI.takeScreenshot()

'Verifikasi element item total terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Overview_Page/Label_SubTotalProductPrice'))

'Verifikasi element tax terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Overview_Page/Label_TaxProductPrice'))

'Verifikasi element Total terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Overview_Page/Label_FinalTotalProductPrice'))

'Verifikasi button Finish terlihat'
WebUI.verifyElementVisible(findTestObject('Checkout_Overview_Page/Button_Finish'))

'Verifikasi button Finish dapat diklik'
WebUI.verifyElementClickable(findTestObject('Checkout_Overview_Page/Button_Finish'))

'Klik button Finish'
WebUI.click(findTestObject('Checkout_Overview_Page/Button_Finish'))

