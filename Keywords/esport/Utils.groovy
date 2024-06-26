package esport

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
import org.apache.commons.lang.RandomStringUtils

import internal.GlobalVariable

public class Utils {

	@Keyword (keywordObject = "Utils")
	def randomString(int length, String type) {
		def randomString = null;
		if (type.equals("num"))
			randomString = RandomStringUtils.randomNumeric(length);
		else if (type.equals("String"))
			randomString = RandomStringUtils.randomAlphabetic(length);
		else
			randomString = RandomStringUtils.randomAlphanumeric(length);

		return randomString;
	}

	@Keyword (keywordObject = "Utils")
	def randomEmail(String domain) {
		def emailAddress = "";
		// Generate random email address
		def alphabet = "abcdefghijklmnopqrstuvwxyz";
		while (emailAddress.length() < 5) {
			def character = (int) (Math.random() * 26);
			emailAddress += alphabet.substring(character, character + 1);
		}
		emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
		emailAddress += domain;
		return emailAddress;
	}

	@Keyword (keywordObject = "Utils")
	def randomArabicString(int length) {
		Random r = new Random(System.currentTimeMillis());
		StringBuilder sb = new StringBuilder();
		def asciirange1 = (int) '\u0621';
		def asciirange2 = (int) '\u063A';
		for (int i = 0; i < length; i++) {
			sb.append((char) (r.nextInt(asciirange2 - asciirange1) + asciirange1));
		}
		return sb.toString();
	}
}
