@SelectHotelPage
Feature: Verifying Adactin hotel Select hotels details

  Background: 
    Given User should entered in adactin hotel home page

  @SelectHotel
  Scenario Outline: Verifying Adactin hotel Select hotels with valid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with "<Location>","<Hotels >","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    And Verify after Search Hotels "Select Hotel"
    And User should select hotel and click continue
    And User should verify After select hotel"Book A Hotel"

    Examples: 
      | userName | password | Location  | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Suresh21 | SURESH   | Melbourne | HotelSunshine | Standard | 2 - Two       | 15/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         |

  @WithoutSelectHotel
  Scenario Outline: Verifying Adactin hotel Select hotels with valid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with "<Location>","<Hotels >","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    And Verify after Search Hotels "Select Hotel"
    And User should click continue without select any hotel
    And User should verify After select hotel error msg"Please Select a Hotel"

    Examples: 
      | userName | password | Location  | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Suresh21 | SURESH   | Melbourne | HotelSunshine | Standard | 2 - Two       | 15/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         |
