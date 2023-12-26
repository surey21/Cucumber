@BookHotelPage
Feature: Verifying Adactin hotel Book hotels details

  Background: 
    Given User should entered in adactin hotel home page

  @passAllFields
  Scenario Outline: Verifying Adactin hotel Book hotels with valid credentials
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with "<Location>","<Hotels >","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    And Verify after Search Hotels "Select Hotel"
    And User should select hotel and click continue
    And User should verify After select hotel"Book A Hotel"
    And User should book hotel "<FirstName>","<LastName>" and "<BillingAddress>"
      | CcNum            | CreditCardType   | ExpiryMonth | ExpiryYear | CVVNO |
      | 1234567890098765 | American Express | January     |       2022 |   456 |
      | 5678901234567890 | VISA             | February    |       2022 |   281 |
      | 4567890123456789 | Master Card      | March       |       2022 |   759 |
      | 3456789012345678 | Other            | April       |       2022 |   478 |
    And User should verify after book hotel "Booking Confirmation"

    Examples: 
      | userName | password | Location  | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom | FirstName | LastName | BillingAddress |
      | Suresh21 | SURESH   | Melbourne | Hotel Sunshine | Standard | 2 - Two       | 15/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         | Suresh    | Kumar    | Chennai        |

  @WithOutFiles
  Scenario Outline: Verifying Adactin hotel Book hotels without enter any files
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with "<Location>","<Hotels >","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
    And Verify after Search Hotels "Select Hotel"
    And User should select hotel and click continue
    And User should verify After select hotel"Book A Hotel"
    And User should perform book a hotel without any details
    And User Should verify after book hotel error with msg "Please Enter your First Name","Please Enter you Last Name","Please Enter your Address","Please Enter your 16 Digit Credit Card Number","Please Select your Credit Card Type","Please Select your Credit Card Expiry Month" and "Please Enter your Credit Card CVV Number"

    Examples: 
      | userName | password | Location  | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate | AdultsperRoom | ChildrenperRoom |
      | Suresh21 | SURESH   | Melbourne | Hotel Sunshine | Standard | 2 - Two       | 15/08/2022  | 16/08/2022   | 2 - Two       | 2 - Two         |
