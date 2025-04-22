Feature: Validación de Seguridad

  Scenario: Intentar acceso sin autorización
    Given El usuario no está autenticado
    When El usuario intenta acceder a una página protegida
    Then El acceso es denegado
    And Un mensaje de error es mostrado