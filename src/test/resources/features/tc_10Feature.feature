Feature: Validación de Rendimiento

  Scenario: Simular carga de 1000 usuarios
    Given el sistema está operativo
    When simulo una carga de 1000 usuarios concurrentes
    Then el sistema sigue funcionando sin caídas