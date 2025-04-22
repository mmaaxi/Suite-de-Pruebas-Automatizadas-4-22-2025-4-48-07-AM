Feature: Validación de Perfil

  Scenario: Editar datos de perfil
    Given que el usuario está en la página de perfil
    When el usuario edita los datos de perfil
    Then el perfil debe ser actualizado con éxito