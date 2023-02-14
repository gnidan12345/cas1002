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
import java.util.Random as Random

public class RandomStringGenerator {
	private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public static String generateRandomString(int length) {
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);
		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(CHARACTERS.length());
			char randomChar = CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}
} 

String name = RandomStringGenerator.generateRandomString(10)

String url = name + '.com'

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.qa38.ucaspio.com/')

WebUI.setText(findTestObject('Object Repository/New Folder/Page_Caspio Login/input_Email_Email'), Username)

WebUI.setEncryptedText(findTestObject('Object Repository/New Folder/Page_Caspio Login/input_Forgot your password_Password'), 
    '5myrBN4o/qfLi7KY8+ko0g==')

WebUI.click(findTestObject('Object Repository/New Folder/Page_Caspio Login/input_Forgot your password_LoginButton'))

WebUI.verifyElementText(findTestObject('Object Repository/New Folder/Page_Caspio - Accounts/h1_Your Caspio accounts'), 'Your Caspio accounts')

WebUI.navigateToUrl('https://c0zob000.qa38.ucaspio.com/integrations/webhooks')

WebUI.click(findTestObject('Object Repository/Page_Caspio - Webhooks/button_Create outgoing webhook'))

WebUI.setText(findTestObject('Object Repository/Page_Caspio - Webhooks/input_Enter a name that will help you ident_770ab1'), 
    name)

WebUI.setText(findTestObject('Object Repository/Page_Caspio - Webhooks/input_Destination URLs_targetUrls.0'), url)

WebUI.click(findTestObject('Object Repository/Page_Caspio - Webhooks/div_1.InformationEnter a name that will hel_bf418a'))

WebUI.click(findTestObject('Object Repository/Page_Caspio - Webhooks/span_Create'))

