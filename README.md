# Test Automation Ramp-Up Task

---

## The task

1. Create a test plan (test suite) containing 5 manual test cases (tests) for testing a new account registration at http://automationpractice.com (a brand-new account creation should be covered)
2. Automate 2 test cases from your test plan and explain why exactly those tests were chosen for automation. 
3. In automation use: Java, TestNG/JUnit and Selenium Webdriver. 
4. Please use Maven for project assembling. 
5. All automated tests should be stable (can be executed multiple times without false failures/issues.)
6. Would be a plus if the implementation will include usage of:
   - Java/OOP best practices
   - PageObject pattern  
   - Tests parameterization 

## Used resources

https://www.swtestacademy.com/selenium-webdriver-tutorial-java-testng/

https://www.selenium.dev/documentation/guidelines/page_object_models/
https://www.swtestacademy.com/page-object-model-java/
http://internetka.in.ua/selenium-page-object/ (RU)\
https://kreisfahrer.gitbooks.io/selenium-webdriver/content/page_object_pattern_arhitektura_testovogo_proekta/ispolzovanie_patterna_page_object.html (RU)

https://medium.com/@kshitishirke/which-locator-is-faster-in-identifying-elements-in-selenium-5aeb3f943f5d

https://www.swtestacademy.com/selenium-wait/
https://www.swtestacademy.com/selenium-actions/
https://stackoverflow.com/questions/35127108/how-to-set-value-to-input-web-element-using-selenium/35127217

https://mkyong.com/junit5/junit-5-parameterized-tests/

https://stackoverflow.com/questions/1459656/how-to-get-the-current-time-in-yyyy-mm-dd-hhmisec-millisecond-format-in-java

https://stackoverflow.com/questions/13354531/maven-project-build-directory
https://stackoverflow.com/questions/49856504/maven-test-classes-custom-directory-layout
https://maven.apache.org/surefire/maven-surefire-plugin/examples/junit-platform.html

## How to use
Run tests via Maven: `mvn test`\
Or run [RegistrationSuite.java](src/main/java/com/github/mackzwellz/tests/RegistrationSuite.java) with any JUint5-compatible runner.
There are 4 tests that should pass.\
There are 2 tests from [KatalonRecorderSuite.java](src/main/java/com/github/mackzwellz/tests/KatalonRecorderSuite.java) and 2 parametrized runs of 1 test from 
[RegistrationSuite.java](src/main/java/com/github/mackzwellz/tests/RegistrationSuite.java).\
The only test in RegistrationSuite is the same test as the second one in KatalonRecorderSuite, but re-implemented using Page Object pattern.