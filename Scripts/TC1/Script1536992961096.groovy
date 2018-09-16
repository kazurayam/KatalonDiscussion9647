import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demoaut-mimic.kazurayam.com/9647_testbed.html')

TestObject outerIFrame = new TestObject()
outerIFrame.addProperty('xpath', ConditionType.EQUALS, "//iframe[@id='wotcAccountWidgetModalIFrame']")
WebUI.verifyElementPresent(outerIFrame, 10, FailureHandling.STOP_ON_FAILURE)

WebUI.switchToFrame(outerIFrame, 10)

TestObject innerIFrame = new TestObject()
innerIFrame.addProperty('xpath', ConditionType.EQUALS, "//iframe[@id='samlWidget']")
WebUI.verifyElementPresent(innerIFrame, 10, FailureHandling.STOP_ON_FAILURE)

//WebUI.switchToFrame(innerIFrame, 10)

TestObject contentDiv = new TestObject()
contentDiv.addProperty('xpath', ConditionType.EQUALS, "//div[@class='modalContent']")

WebUI.verifyElementPresent(contentDiv, 10, FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()
