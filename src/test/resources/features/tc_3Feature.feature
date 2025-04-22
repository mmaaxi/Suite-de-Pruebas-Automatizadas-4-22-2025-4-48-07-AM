Feature: Validación de Registro

  Scenario: Completar formulario de registro y verificar notificación
    Given I am on the registration page
    When I complete the registration form with valid data
    Then I should see a confirmation message stating "Profile created successfully"
    And a notification should be sent to the registered email