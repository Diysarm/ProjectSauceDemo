package product

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.math.RoundingMode

import org.openqa.selenium.WebElement

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
	@Keyword
	public void verifyProductCountCart() {

		String expectedProductInCart = WebUI.getText(findTestObject('Object Repository/Global_Header/Label_ProductCountCART'))
		int expectedProductInCartInt = expectedProductInCart.toInteger() //3
		for(int productInCart = 1; productInCart <= expectedProductInCartInt; productInCart++) {
			String actualProductName = WebUI.getText(findTestObject('Object Repository/Cart_Page/Label_ProductInCart', [('productInCart') : productInCart]))
			println("nama produk: " + actualProductName)
		}
	}

	@Keyword
	public void verifyProductPrice() {
		String expectedProductInCart = WebUI.getText(findTestObject('Object Repository/Global_Header/Label_ProductCountCART'))
		int expectedProductInCartInt = expectedProductInCart.toInteger() //3
		BigDecimal subTotalPrice = BigDecimal.ZERO

		for(int productPrice = 1; productPrice <= expectedProductInCartInt; productPrice++  ) {
			String actualProductPrice = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_ProductPrice', [('productPrice') : productPrice]))
			BigDecimal decimalPrice = new BigDecimal(actualProductPrice.replaceAll("[^\\d\\.]", ""))
			subTotalPrice = subTotalPrice.add(decimalPrice)
			println(subTotalPrice)
		}
		String subTotalPriceWebText = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_SubTotalProductPrice'))
		BigDecimal subTotalPriceWeb = new BigDecimal(subTotalPriceWebText.replaceAll("[^\\d\\.]", ""))
		if(subTotalPrice.equals(subTotalPriceWeb)) {
			println ('Perhitungan sudah sesuai' +' '+ 'Sub total pada web: ' + subTotalPriceWeb + ' '+ 'Sub total perhitungan: ' + subTotalPrice)
		} else println('Perhitungan belum sesuai' +' '+ 'Sub total pada Web: '+ subTotalPriceWeb +' '+ 'Sub Total yang dihitung: ' + subTotalPrice)

		String taxPriceWebText = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_TaxProductPrice'))
		BigDecimal taxPriceWeb = new BigDecimal(taxPriceWebText.replaceAll("[^\\d\\.]", ""))
		BigDecimal calculatedTax = subTotalPrice.multiply(new BigDecimal("0.08")).setScale(2, RoundingMode.HALF_UP)
		if(calculatedTax.compareTo(taxPriceWeb) == 0 ) {
			println('Perhitungan Tax sudah sesuai: ' +taxPriceWeb)
		} else println('Perhitungan Tax belum sesuai: ' +taxPriceWeb)

		String finalTotalPriceWebText = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_FinalTotalProductPrice'))
		BigDecimal finalTotalPriceWeb = new BigDecimal(finalTotalPriceWebText.replaceAll("[^\\d\\.]", ""))
		BigDecimal finalTotalPrice = subTotalPrice.add(calculatedTax)
		if(finalTotalPrice.compareTo(finalTotalPriceWeb) == 0) {
			println('Final total sudah sesuai: '  + finalTotalPriceWeb)
		} else println('Final total belum sesuai: '+ finalTotalPriceWeb )
	}
}