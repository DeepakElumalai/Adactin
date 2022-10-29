Feature: Hotel Booking In Adactin Application

Scenario: User Login In The Adactin Application
Given user Launch The Adactin Application
When user Enter The Username In Username Field
And user Enter The Password In Password Field
Then user Click The Login Button And It Navigates To Search Hotel Page

Scenario: User To Search The Hotels In Adactin Application
When user To Select The Location Of The Hotels
And user To Select The Hotels
And user To Select The Room Type
And user To Select The Number Of Rooms
And user To Enter The Check In Date		
And user To Enter The Check Out Date
And user To Select The Adults Per Room
And user To Select The Children Per Room 
Then user Click The Search Button And It Navigates To Select Hotel Page

Scenario: User To Select The Hotels In Adactin Application
When user To Select The Hotel
Then user Click The Continue Button And It Navigates To Book A Hotel Page

Scenario: User To Book  The Hotels In Adactin Application
When user To Enter The First Name In First Name Field
And user To Enter The Last Name In the Last Name Field
And user To Enter The Billing Address In the Billing Address Field
And user To Enter The Credit Card No In the Credit Card No Field
And user To Select The Credit Card Type In the Credit Card Type Field
And user To Select The Expiry Date In the Expiry Date Field
And user To Select The Expiry Date Year In the Expiry Date Year Field
And user To Enter The CVV Number In the CVV Number Field
Then user Click The Book Now Button And It Navigates To Booking Confirmation Page

Scenario: User To Logout The Adactin Application
Then user Click The Logout Button