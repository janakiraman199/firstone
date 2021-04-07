Feature: login funtionality of adactin application

#Background:
#    Given User launching the adactin application
#    When User enter "Sowmiyasri" as username
#    And User enter "Sowmiya05" as password
#    Then User has entered valid username and password in


Scenario:  User enter valid username and valid password
    Given User launching the adactin application
    When User enter "SowmiyaSri" as username
    And User enter "Sowmiya05" as password
    Then User has entered valid username and password
    
    
    Scenario: User enter valid location, valid hotel, valid roomtype, valid number of rooms, valid checkin date, valid checkout date, valid adults, valid children
        Given User entering valid datas in search hotel
        When User enter valid location
        And User enter valid hotel
        And User enter valid roomtype
        And User enter valid number of rooms
        And User enter valid checkin date
        And User enter valid checkout date
        And User enter valid adults
        And User enter valid children
        Then User clicks search option
        
    Scenario: User selects valid hotel, clicks radiobutton, clicks search option
        Given User selecting valid hotel name
        When User clicks the radio button
        Then User clicks search options
        
        
        Scenario: User enter valid first name, valid last name, valid address, valid card number, valid card type, valid expiry date, valid cvv number
            Given User enter valid fisrt name
            And User enter valid last name
            And User enter valid address
            And User enter valid card number
            And User enter valid card type
            And User enter valid expiry date
            And User enter valid expiry year
            And User enter valid cvv number
            Then User clicks booknow option
            
            
            Scenario: User click logout options
                Given User clicks logout
                Then User exits out of application