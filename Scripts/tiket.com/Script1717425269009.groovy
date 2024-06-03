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

WebUI.navigateToUrl('https://www.tiket.com/')

WebUI.click(findTestObject('Object Repository/tets jodi/Page_tiket.com - Satu Aplikasi untuk Kebutu_9595f9/div_Aktivitas di Bali_VerticalIcons_icon__M26iM'))

WebUI.click(findTestObject('Object Repository/tets jodi/Page_Tiket Pesawat Murah  Promo Tiket Pesaw_2770c0/span_Medan'))

WebUI.click(findTestObject('Object Repository/tets jodi/Page_Tiket Pesawat Murah  Promo Tiket Pesaw_2770c0/span_Mau ke mana'))

WebUI.click(findTestObject('Object Repository/tets jodi/Page_Tiket Pesawat Murah  Promo Tiket Pesaw_2770c0/span_Jakarta'))

WebUI.click(findTestObject('Object Repository/tets jodi/Page_Tiket Pesawat Murah  Promo Tiket Pesaw_2770c0/button_Ayo Cari'))

WebUI.closeBrowser()

