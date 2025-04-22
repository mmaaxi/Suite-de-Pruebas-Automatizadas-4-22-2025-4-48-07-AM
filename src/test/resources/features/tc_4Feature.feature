Feature: Validación de Búsqueda

  Scenario: Ingresar término de búsqueda
    Given el usuario está en la página de búsqueda
    When el usuario ingresa el término de búsqueda "Selenium"
    Then los resultados relevantes se despliegan