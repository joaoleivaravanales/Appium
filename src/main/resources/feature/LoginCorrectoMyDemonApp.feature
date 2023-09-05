@Caso002
Feature: Realizar ingreso correcto a aplicativo MyDemonAPP
  Scenario Outline: Login correcto en aplicativo MyDemonAPP
    Given Cuando ingreso al aplicativo MyDemonAPP
    When Selecciono el acordeon posicionado en la perte superior izquierda
    And Selecciono la opcion de "Log In" dentro del acordeon
    And Valido los siguientes textos
    |campo|
    |Login|
    |Username|
    |Password|
    And Ingreso el "<Username>" en la caja de texto junto a la "<Password>"
    And Presiono el boton de "Login" dentro de la pagina
    Then Valido que redireccione a la pagina de "Products"

    Examples:
      | Username | Password |
      | bob@example.com | 10203040 |