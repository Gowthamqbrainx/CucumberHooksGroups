Feature: To book the hotel in adactin website
	@Sanity
  Scenario Outline: To pass all the basics credentials inorder to get the booking id
    Given User has to enter the url "<url>"
    When User ha to enter the usernam "<username>" and "<password>"
    And User has to click the login button to enter into the home page
    Then User has to verify whether he is in the correct page or not

    Examples: 
      | url                                    | username | password       |
      | https://adactin.com/HotelApp/index.php | GOWTHAMK | MyvizhiGowtham |

  Scenario Outline: To select the location and hotel options in the dropdowns
    Given User is in the hotel search page
    When User has to select the location "<location>" and "<hotel>" in hotel search page

    Examples: 
      | location | hotel        |
      | Brisbane | Hotel Hervey |

  Scenario Outline: To select the room type and number of rooms options in the dropdowns
    Given User is in the hotel search page
    When User has to select the room type "<roomtype>" and number of rooms "<noofrooms>" in hotel search page

    Examples: 
      | roomtype     | noofrooms |
      | Super Deluxe | 1 - One   |

  Scenario Outline: To select the adults and childrens per room options in the dropdowns
    Given User is in the hotel search page
    When User has to select the adults "<adults>" and childs "<childs>" in hotel search page
    Then User has to click the sublit button to proceed booking process

    Examples: 
      | adults  | childs  |
      | 2 - Two | 1 - One |
