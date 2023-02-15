Feature: Login

Scenario: Successful login with valid credentials
	Given User launch Chrome browser
	When  User open url "https://admin-demo.nopcommerce.com/login"
	And 	User enters email as "admin@yourstore.com" and password as "admin"
	And   click on login
	Then  page title should be "Dashboard/  NopCommerce administration"
	When  User click on log out link
	Then  page title should be "Your store.login"
	And   close browser
