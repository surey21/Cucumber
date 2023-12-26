@CancelBookingPage
Feature: Verifying Adactin hotel Cancel Booking details

  Background: 

  @CancelOrderid
  Scenario Outline: Verifying Adactin hotel Book hotels and cancelling with valid credentials
    Given User should entered in adactin hotel home page
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should Search a hotel with "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>","<AdultsperRoom>" and "<ChildrenperRoom>"
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

  @ParticularOrderidCancel
  Scenario Outline: Verifying Adactin hotel cancelling with Order Id
    Given User should entered in adactin hotel home page
    When User should perform login "<userName>","<password>"
    Then Verify after Login "Hello Suresh21!"
    And User should cancel booking with exisiting "<OrderId>"
    Then User should verify after order id cancelled msg contains"The booking has been cancelled."

    Examples: 
      | userName | password | OrderId    |
      | Suresh21 | SURESH   | Y42H91529Q |
