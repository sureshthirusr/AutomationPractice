$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/cucumber/feature/AutomationPractice.feature");
formatter.feature({
  "line": 2,
  "name": "AutomationPractice End to End Test Case",
  "description": "",
  "id": "automationpractice-end-to-end-test-case",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "duration": 129800,
  "status": "passed"
});
formatter.before({
  "duration": 1192600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User open application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User reach the homepage",
  "keyword": "And "
});
formatter.match({
  "location": "AutomationStepDefinition.user_open_application()"
});
formatter.result({
  "duration": 115078900,
  "status": "passed"
});
formatter.match({
  "location": "AutomationStepDefinition.user_reach_the_homepage()"
});
formatter.result({
  "duration": 34200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify the customer or user is able to Login the Application",
  "description": "",
  "id": "automationpractice-end-to-end-test-case;verify-the-customer-or-user-is-able-to-login-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User launch the AutomationPractice application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User Click on SignIn Button in the header",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User Enter email Id \"abcd1ef@gmail.com\" in SignIn page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Enter Password \"12345\" in SignIn page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User Click SignIn button in SignIn page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User Verify the UserName displayed in the header",
  "keyword": "Then "
});
formatter.match({
  "location": "AutomationStepDefinition.user_launch_the_AutomationPractice_application()"
});
formatter.result({
  "duration": 8631793800,
  "status": "passed"
});
formatter.match({
  "location": "AutomationStepDefinition.user_Click_on_SignIn_Button_in_the_header()"
});
formatter.result({
  "duration": 7958615400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1ef@gmail.com",
      "offset": 21
    }
  ],
  "location": "AutomationStepDefinition.user_Enter_email_Id_in_SignIn_page(String)"
});
formatter.result({
  "duration": 163833700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 21
    }
  ],
  "location": "AutomationStepDefinition.user_Enter_Password_in_SignIn_page(String)"
});
formatter.result({
  "duration": 248623400,
  "status": "passed"
});
formatter.match({
  "location": "AutomationStepDefinition.user_Click_SignIn_button_in_SignIn_page()"
});
formatter.result({
  "duration": 5160838400,
  "status": "passed"
});
formatter.match({
  "location": "AutomationStepDefinition.user_Verify_the_UserName_displayed_in_the_header()"
});
formatter.result({
  "duration": 57742600,
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: An invalid or illegal selector was specified\n  (Session info: chrome\u003d84.0.4147.105)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-FR81P7PN\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\91917\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:49886}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 7d4b0622321108d2c6cbde7e31616d67\n*** Element info: {Using\u003dclass name, value\u003d}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByClassName(RemoteWebDriver.java:412)\r\n\tat org.openqa.selenium.By$ByClassName.findElement(By.java:389)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.cucumber.stepdefinition.AutomationStepDefinition.user_Verify_the_UserName_displayed_in_the_header(AutomationStepDefinition.java:81)\r\n\tat ✽.Then User Verify the UserName displayed in the header(src/test/java/com/cucumber/feature/AutomationPractice.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 43000,
  "status": "passed"
});
formatter.after({
  "duration": 839202800,
  "status": "passed"
});
});