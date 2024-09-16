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

'Verifikasi label checkout: Your Information terlihat'
WebUI.verifyElementVisible(findTestObject('YourInformation_Page/Label_Checkout Your Information'))

'Verifikasi element FirstName Terlihat'
WebUI.verifyElementVisible(findTestObject('YourInformation_Page/TextArea_FirstName'))

'Input text firstName'
WebUI.setText(findTestObject('YourInformation_Page/TextArea_FirstName'), firstName)

'ambil atribut value firstName yang telah diinput'
String namapertama = WebUI.getAttribute(findTestObject('YourInformation_Page/TextArea_FirstName'), 'value')

'print value firstName yang telah diinput'
println(namapertama)

'Mengambil Screenshot pada Window'
WebUI.takeScreenshot()

'Verifikasi element LastName Terlihat'
WebUI.verifyElementVisible(findTestObject('YourInformation_Page/TextArea_LastName'))

'Input text lastName'
WebUI.setText(findTestObject('YourInformation_Page/TextArea_LastName'), lastName)

'ambil atribut value lastName yang telah diinput'
String namaterakhir = WebUI.getAttribute(findTestObject('YourInformation_Page/TextArea_LastName'), 'value')

'print value lastName yang telah diinput'
println(namaterakhir)

'mengambil Screenshot pada window'
WebUI.takeScreenshot()

'Verifikasi element postalCode Terlihat'
WebUI.verifyElementVisible(findTestObject('YourInformation_Page/TextArea_PostalCode'))

'Input text PostalCode'
WebUI.setText(findTestObject('YourInformation_Page/TextArea_PostalCode'), postalCode)

'ambil atribut value postalcode yang telah diinput'
String postalcode = WebUI.getAttribute(findTestObject('YourInformation_Page/TextArea_PostalCode'), 'value')

'print value postalCode'
println(postalcode)

'mengambil screenshot pada window'
WebUI.takeScreenshot()

'Verifikasi element button continue Terlihat'
WebUI.verifyElementVisible(findTestObject('YourInformation_Page/Button_Continue'))

'Verifikasi element button continue dapat diklik'
WebUI.verifyElementClickable(findTestObject('YourInformation_Page/Button_Continue'))

'klik button Continue'
WebUI.click(findTestObject('YourInformation_Page/Button_Continue'))

'Tekan button back browser'
WebUI.back()
