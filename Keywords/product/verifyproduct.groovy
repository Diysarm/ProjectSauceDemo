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
import com.kms.katalon.core.util.KeywordUtil

import internal.GlobalVariable

public class verifyproduct {

	// Verifikasi nama produk didepan sudah sesuai dengan data
	@Keyword
	public void verifyProductName() {

		// Mengambil data dari Data Files/productData
		TestData productDataExcel = findTestData('Data Files/productData (1)')

		// Looping locator berdasarkan rownumber yang ada di data files
		for(int productsName = 1; productsName <= productDataExcel.getRowNumbers(); productsName++) {
			String expectedProductName = productDataExcel.getValue(1, productsName)
			String actualProductName = WebUI.getText(findTestObject('Object Repository/Product_Page/Label_ProductsName', [('productsName') : productsName]))

			//Validasi jika actualProductName sama dengan expectedProductName
			if(actualProductName.equals(expectedProductName)) {
				KeywordUtil.logInfo("Product name match: "+ actualProductName)
			}else KeywordUtil.markError("Product name NOT match: "+ productDataExcel + "found: " +actualProductName)
		}
	}

	//Verifikasi quantity product didalam cart sudah sesuai dengan logo angka di cart
	@Keyword
	public void verifyProductCountCart() {

		// Mengambil jumlah produk yang diharapkan ada di keranjang
		String expectedProductInCart = WebUI.getText(findTestObject('Object Repository/Global_Header/Label_ProductCountCART'))
		int expectedProductInCartInt = expectedProductInCart.toInteger()

		// Variabel untuk menghitung produk yang ada di dalam keranjang
		int countedProductInCart = 0

		// Looping locator berdasarkan produk yang sudah diambil diatas
		for(int productInCart = 1; productInCart <= expectedProductInCartInt; productInCart++) {
			String actualProductName = WebUI.getText(findTestObject('Object Repository/Cart_Page/Label_ProductInCart', [('productInCart') : productInCart]))
			KeywordUtil.logInfo("nama produk: " + actualProductName)

			// Menambahkan hitungan untuk verifikasi
			countedProductInCart++
		}
		// Memastikan jumlah produk di cart sesuai
		if(expectedProductInCartInt  == countedProductInCart ) {
			KeywordUtil.logInfo("Product Quantity Match: " + countedProductInCart)
		} else KeywordUtil.markError("Product Quantity Not Match: " + countedProductInCart)
	}

	// Verifikasi harga + tax sudah sesuai
	@Keyword
	public void verifyProductPrice() {

		// Mengambil jumlah produk pada halaman checkout
		String expectedProductInCart = WebUI.getText(findTestObject('Object Repository/Global_Header/Label_ProductCountCART'))
		int expectedProductInCartInt = expectedProductInCart.toInteger()

		// Variabel untuk menghitung subTotalPrice diawali dari BigDecimal 0
		BigDecimal subTotalPrice = BigDecimal.ZERO

		// Looping melalui harga produk untuk menghitung subtotal
		for(int productPrice = 1; productPrice <= expectedProductInCartInt; productPrice++  ) {
			// Mengambil harga tiap produk
			String actualProductPrice = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_ProductPrice', [('productPrice') : productPrice]))
			// Mengonversi harga menjadi BigDecimal setelah menghapus simbol
			BigDecimal decimalPrice = new BigDecimal(actualProductPrice.replaceAll("[^\\d\\.]", ""))
			subTotalPrice = subTotalPrice.add(decimalPrice)
			KeywordUtil.logInfo("Harga pada Item Total: " + subTotalPrice)
		}
		// Mengambil ItemTotal dari web dan membandingkan
		String subTotalPriceWebText = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_SubTotalProductPrice'))
		BigDecimal subTotalPriceWeb = new BigDecimal(subTotalPriceWebText.replaceAll("[^\\d\\.]", ""))
		if(subTotalPrice.equals(subTotalPriceWeb)) {
			KeywordUtil.logInfo ('Perhitungan sudah sesuai' +' '+ 'Sub total pada web: ' + subTotalPriceWeb + ' '+ 'Sub total perhitungan: ' + subTotalPrice)
		} else KeywordUtil.markError('Perhitungan belum sesuai' +' '+ 'Sub total pada Web: '+ subTotalPriceWeb +' '+ 'Sub Total yang dihitung: ' + subTotalPrice)

		// Mengambil Tax dari web dan menghitung tax secara manual
		String taxPriceWebText = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_TaxProductPrice'))
		BigDecimal taxPriceWeb = new BigDecimal(taxPriceWebText.replaceAll("[^\\d\\.]", ""))
		BigDecimal calculatedTax = subTotalPrice.multiply(new BigDecimal("0.08")).setScale(2, RoundingMode.HALF_UP)

		// Memastikan bahwa tax sudah sesuai
		if(calculatedTax.compareTo(taxPriceWeb) == 0 ) {
			KeywordUtil.logInfo('Perhitungan Tax sudah sesuai: ' +taxPriceWeb)
		} else KeywordUtil.markError('Perhitungan Tax belum sesuai: ' +taxPriceWeb)

		// Mengambil total harga dari web dan menghitung total akhir
		String finalTotalPriceWebText = WebUI.getText(findTestObject('Object Repository/Checkout_Overview_Page/Label_FinalTotalProductPrice'))
		BigDecimal finalTotalPriceWeb = new BigDecimal(finalTotalPriceWebText.replaceAll("[^\\d\\.]", ""))
		BigDecimal finalTotalPrice = subTotalPrice.add(calculatedTax)

		// Memastikan bahwa total akhir sudah sesuai
		if(finalTotalPrice.compareTo(finalTotalPriceWeb) == 0) {
			KeywordUtil.logInfo('Final total sudah sesuai: '  + finalTotalPriceWeb)
		} else KeywordUtil.markError('Final total belum sesuai: '+ finalTotalPriceWeb )
	}
}