# ChekkCNBCBDD
CNBC Project for Chekk--

     






                                                                   TEST 1 : Selenium Test

Issue in task- 

CNBC implemented reCAPTCHA So due to this some cases are fail.

Note- We can automate the reCAPTCHA in test environment, so disable the reCAPTCHA or if its visible then manually add the security Ans, but in CNBC platform reCAPTCHA  is disabled its active if we perform the automation process /manually its working fine.  

Cucumber framework(BDD) with Pageobject + TestNG Used with Maven Project

Components of the Framework:
1.	Programming language: Java + Selenium
2.	IDE: Eclipse
3.	Testing Framework: TestNG + Cucumber (BDD)


Dependency List
1.	Cucumber Java – 7.12.0
2.	Cucumber TestNG – 7.12.0  
3.	Maven – 3.8.
4.	Selenium – 4.11.0
5.	TestNG – 7.7.1
6.	Java-11


1.Create a new Maven Project
2.Create source folder src/test/resources to create test scenarios in the Feature file
3.Add Selenium, TestNG, and Cucumber dependencies to the project
4.Add Maven Compiler Plugin and Surefire Plugin
5. Create a feature file in the src/test/resources

     

6.Create the classes for locators, actions, and utilities in src/main/java




 





 

 


7.Adding Step definitions

 


8.Create a JUnit Cucumber Runner class in the src/test/java

 


9. Features Files- for scenarios 

 


10.Cucumber Report Generation and Screenshot

     


Note- WE can also configure TeastNG Report 






