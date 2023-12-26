@SearchHotelPage
Feature: Verifying Adactin hotel Search hotels details

  Background: 
    Given User should entered in adactin hotel home page

  @SearchHotel
  Scenario Outline: Verifying Adactin hotel Search hotels with valid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with "<Location>","<Hotels >","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    And Verify after Search Hotels "Select Hotel"

    Examples: 
      | userName | password | Location  | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Suresh21 | SURESH   | Melbourne | HotelHervey | Standard | 2 - Two       | 15/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         |

  @searchHotel
  Scenario Outline: Verifying Adactin hotel Search hotels manatory fields valid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with "<Location>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>" and "<AdultsperRoom>"
    And Verify after Search Hotels "Select Hotel"

    Examples: 
      | userName | password | Location  | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom |
      | Suresh21 | SURESH   | Melbourne | 2 - Two       | 15/08/2022  | 16/08/2022   | 2 - Two       |

  @SearchHotelinvalidDate
  Scenario Outline: Verifying Adactin hotel Search hotels Check in Date and Check out date invalid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with invalid date "<Location>","<Hotels >","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    And Verify after Search Hotels error date msg  "Check-In Date shall be before than Check-Out Date" , "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName | password | Location  | Hotels      | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Suresh21 | SURESH   | Melbourne | HotelHervey | Standard | 2 - Two       | 15/08/2023  | 16/08/2022   | 2 - Two       | 2 - Two         |

  @SearchHotelerror
  Scenario Outline: Verifying Adactin hotel Search hotels without enter any files
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should perform Search a hotel without any credentials
    And Verify after Search Hotels error select files msg "Please Select a Location"

    Examples: 
      | userName | password |
      | Suresh21 | SURESH   |
