package packaged

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class verifyproduct {

	@Keyword
	public void verifyProductName() {

		TestData productDataExcel = findTestData('Data Files/productData (1)')

		for(int productsName = 1; productsName <= productDataExcel.getRowNumbers(); productsName++) {
			String expectedProductName = productDataExcel.getValue(1, productsName)
			String actualProductName = WebUI.getText(findTestObject('Object Repository/Product_Page/Label_ProductsName', [('productsName') : productsName]))
			if(actualProductName.equals(expectedProductName)) {
				println("Product name match: "+ actualProductName)
			}else println("Product name NOT match: "+ productDataExcel + "found: " +actualProductName)
		}
	}
}