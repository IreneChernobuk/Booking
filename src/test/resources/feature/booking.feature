Feature: Search for hotel

  Scenario Outline: User goes search page and input Hotel select <hotel> and check <rating> hotel
    Given Search Booking page opened
    When User input <hotel> and click Search Button
    Then <hotel> exists
    And <rating> coincided
    Examples:
      | hotel                    | rating |
      | "Hilton Dubai Jumeirah"  | "7.8"  |
      | "Gaudi Hotel"            | "8.2"  |
      | "Fragata Island House"   | "8.9"  |
      | "Novotel Vilnius Centre" | "9.0"  |