Feature: Validación de Login

  Scenario: Login con credenciales válidas
    Given El usuario navega a la página de login
    When El usuario ingresa el nombre de usuario "usuarioValido"
    And El usuario ingresa la contraseña "contraseñaValida"
    And El usuario hace clic en el botón de login
    Then El usuario debe obtener acceso exitoso al sistema