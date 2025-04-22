Feature: Validación de Notificaciones

    Scenario: Activar notificaciones
        Given el usuario está en la pantalla de configuraciones
        When el usuario activa las notificaciones
        Then las notificaciones están activadas en la aplicación