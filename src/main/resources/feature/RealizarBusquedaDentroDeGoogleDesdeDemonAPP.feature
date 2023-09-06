@Caso004
Feature: Ingresar a Webview en Menu Lateral
  Scenario Outline: Ingresar de forma correcta a Menu opcion WebView
    Given Cuando ingreso al aplicativo MyDemonAPP
    When Selecciono el acordeon posicionado en la perte superior izquierda
    And Selecciono la opcion de "Webview" dentro del acordeon
    And Valido los siguientes textos en pagina TextView
      |campo|
      |Webview|
      |URL|
      |Enter an HTTPS url.|
    And Ingreso en el campo la "<URL>"
    And Presiono el boton de "Go To Site"
    And Visualizo que estoy en la pagina de "google"
    And Ingreso texto "Appium espanol" en el buscador
    And Presiono boton de busqueda "Lupa" en la pagina de google
    And Me posiciono con el scroll en un texto en especifico

    Examples:
      | URL |
      | www.google.cl |