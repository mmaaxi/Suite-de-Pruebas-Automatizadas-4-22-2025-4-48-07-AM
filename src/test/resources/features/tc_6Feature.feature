Feature: Validación de Pago

  Scenario: Realizar pago con tarjeta válida
    Given el usuario está en la página de pago
    When el usuario ingresa los detalles de una tarjeta válida
    And confirma el pago
    Then la orden debe ser confirmada y el pago debe ser aprobado