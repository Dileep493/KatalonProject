import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.seleniumeasy.com/test/')

WebUI.click(findTestObject('Page_Selenium Easy - Best Demo webs/a_Input Forms'))

WebUI.click(findTestObject('Page_Selenium Easy - Best Demo webs/a_Simple Form Demo'))

WebUI.setText(findTestObject('Page_Selenium Easy Demo - Simple Fo/input_user-message'), 'abcd')

WebUI.click(findTestObject('Page_Selenium Easy Demo - Simple Fo/button_Show Message'))

WebUI.setText(findTestObject('Page_Selenium Easy Demo - Simple Fo/input_sum1'), '02')

WebUI.setText(findTestObject('Page_Selenium Easy Demo - Simple Fo/input_sum2'), '03')

WebUI.click(findTestObject('Page_Selenium Easy Demo - Simple Fo/button_Get Total'))

WebUI.closeBrowser()

