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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.amazon.com/')
WebUI.click(findTestObject('Object Repository/Page_Online Shopping site in India Shop Onl_10c5f3/span_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_email'), 'Sreekar0119@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/inputcontinue'))

WebUI.setText(findTestObject('Object Repository/Page_Amazon Sign In/input_password'), '04081973')

WebUI.click(findTestObject('Object Repository/Page_Amazon Sign In/inputsignInSubmit'))

// Type the search query into the search box
WebUI.setText(findTestObject('Amazon/Page_Amazon.com/input_twotabsearchtextbox'), 'mobilephone')

// Press Enter key to perform the search
WebUI.sendKeys(findTestObject('Amazon/Page_Amazon.com/input_twotabsearchtextbox'), Keys.chord(Keys.ENTER))

// Wait for search results to load
WebUI.waitForElementPresent(findTestObject('Amazon/Page_Amazon.com/div_s-main-slot'), 10)

// Verify that search results are present
WebUI.verifyElementPresent(findTestObject('Amazon/Page_Amazon.com/span_s-no-results-0'), 10)

WebUI.closeBrowser()



