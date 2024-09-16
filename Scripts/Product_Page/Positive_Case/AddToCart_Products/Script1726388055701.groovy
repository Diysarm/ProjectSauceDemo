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

'Verifikasi apakah nama product sesuai dengan product data di Excel'
CustomKeywords.'product.verifyproduct.verifyProductName'()

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

'Verifikasi button add to cart terlihat'
WebUI.verifyElementVisible(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Backpack'))

'Verifikasi button add to cart dapat diklik'
WebUI.verifyElementClickable(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Backpack'))

'Klik button add to cart'
WebUI.click(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Backpack'))

'Verifikasi button remove terlihat'
WebUI.verifyElementVisible(findTestObject('Product_Page/Button_Remove_Sauce Labs Backpack'))

'Verifikasi button remove dapat diklik'
WebUI.verifyElementClickable(findTestObject('Product_Page/Button_Remove_Sauce Labs Backpack'))

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

'Verifikasi button add to cart terlihat'
WebUI.verifyElementVisible(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Bike Light'))

'Verifikasi button add to cart dapat diklik'
WebUI.verifyElementClickable(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Bike Light'))

'Klik button add to cart'
WebUI.click(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Bike Light'))

'Verifikasi button remove terlihat'
WebUI.verifyElementVisible(findTestObject('Product_Page/Button_Remove_Sauce Labs Bike Light'))

'Verifikasi button remove dapat diklik'
WebUI.verifyElementClickable(findTestObject('Product_Page/Button_Remove_Sauce Labs Bike Light'))

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

'Verifikasi button add to cart terlihat'
WebUI.verifyElementVisible(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Bolt T-Shirt'))

'Verifikasi button add to cart dapat diklik'
WebUI.verifyElementClickable(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Bolt T-Shirt'))

'Klik button add to cart'
WebUI.click(findTestObject('Product_Page/Button_AddToCart_Sauce Labs Bolt T-Shirt'))

'Verifikasi button remove terlihat'
WebUI.verifyElementVisible(findTestObject('Product_Page/Button_Remove_Sauce Labs Bolt T-Shirt'))

'Verifikasi button remove dapat diklik'
WebUI.verifyElementClickable(findTestObject('Product_Page/Button_Remove_Sauce Labs Bolt T-Shirt'))

'Mengambil screenshot pada window'
WebUI.takeScreenshot()

