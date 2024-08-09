@Caso006 @Android
Feature: Realizar ingreso correcto a opcion about menu
  Scenario: Seleccionar opcion about en menu aplicativo
    Given Cuando ingreso al aplicativo MyDemonAPP
    When Selecciono el acordeon posicionado en la perte superior izquierda
    And Selecciono la opcion de "About" dentro del acordeon
    Then Valido que redireccione a la pagina de "About"

@Caso007 @Android
  Scenario: Seleccionar opcion FingerPrint en menu aplicativo
    Given Cuando ingreso al aplicativo MyDemonAPP
    When Selecciono el acordeon posicionado en la perte superior izquierda
    And Selecciono la opcion de "FingerPrint" dentro del acordeon
    And Valido el texto de "Biometrics"
    And Presiono el boton de "OK"
    Then valido el body de la pagina FingerPrint
    """
    Normally this screen would be behind a secure login, but for demo purposes this screen has been put in the menu by default.
    """

  @Caso008 @Android
  Scenario: Seleccionar opcion API CALLS en menu aplicativo
    Given Cuando ingreso al aplicativo MyDemonAPP
    When Selecciono el acordeon posicionado en la perte superior izquierda
    And Selecciono la opcion de "API CALL" dentro del acordeon
    And Presiono el boton de "404"
    Then Valido el texto de "Not found"

