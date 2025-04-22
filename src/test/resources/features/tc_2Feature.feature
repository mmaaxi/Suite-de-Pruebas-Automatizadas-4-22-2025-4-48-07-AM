Feature: Validación de Logout

  Scenario: Usuario cierra sesión y es redirigido a la página de login
    Given el usuario está en la página principal
    When el usuario clickea en el botón de logout
    Then el usuario debería ser redirigido a la página de login