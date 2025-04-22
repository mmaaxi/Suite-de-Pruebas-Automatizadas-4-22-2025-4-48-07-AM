Feature: Validación de Agregar al Carrito

  Scenario: Seleccionar un producto y agregar al carrito
    Given el usuario está en la página de listado de productos
    When el usuario selecciona un producto
    And el usuario añade el producto al carrito
    Then el producto es añadido al carrito con éxito