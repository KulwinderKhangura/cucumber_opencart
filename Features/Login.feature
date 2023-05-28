Feature: Login with valid Credentials


@sanity
	Scenario: Successful Login with valid Credentials
		Given User Launch browser
		And opens URL "http://localhost/opencart/upload/"
		When User navigate to MyAccount menu
		And click on Login
		And User enters Email as "hellojatta@gmail.com" and Password as "hellojatta"
		And Click on Login button
		Then User navigates to MyAccount Page
		 
