
@Caso001
  Feature: Realizar ingreso incorrecto a aplicativo MyDemonAPP
    Scenario Outline: Login Incorrecto en aplicativo MyDemonAPP
    Given Cuando ingreso al aplicativo MyDemonAPP
    When Selecciono el acordeon posicionado en la perte superior izquierda
    And Selecciono la opcion de "Log In" dentro del acordeon
    And Valido el titulo de la pagina "Login"
    And Valido el "subtitulo" de leyenda del cuerpo abajo del Login
    And Valido que se encuentre el texto "Username" arriba de la caja de cuadro
    And Valido que se encuentre el texto "Password" arriba de la caja de cuadro
    And Ingreso el "<Username>" en la caja de texto junto a la "<Password>"
    And Presiono el boton de "Login" dentro de la pagina
    Then Valido el texto de "Login Incorrecto"

  Examples:
  | Username | Password |
  | UserIncorrect | User123 |