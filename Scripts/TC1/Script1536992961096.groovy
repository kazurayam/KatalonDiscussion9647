import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:3000/')

TestObject inputField = new TestObject()
inputField.addProperty('xpath', ConditionType.EQUALS, "//input[@id='myInput']")

WebUI.verifyElementPresent(inputField, 10, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
