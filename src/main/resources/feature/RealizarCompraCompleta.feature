@Caso005
Feature: Realizar compra completa en aplicativo MyDemonAPP
  Scenario Outline: Realizar compra de mochila
    Given Cuando ingreso al aplicativo MyDemonAPP
    When presiono el objeto que deseo comprar "<objeto>"
    And Valido el nombre del objeto seleccionado "<tituloObjeto>"
    And Presiono el boton de "Add to Cart"
    And Visualizo el carrito que se haya agregado
    And Presiono el carrito de compras
    And Valido que se visualice el objeto seleccionado "<tituloObjeto>"
    And Presiono el boton de "Proceed to Checkout"
    And Ingreso el "<Username>" en la caja de texto junto a la "<Password>"
    And Presiono el boton de "Login" dentro de la pagina
    And Ingreso nombre completo en el campo "<fullName>"
    And Ingreso direccion completa en el campo "<AddressOne>"
    And Ingreso direccion completa en el campo "<AddressTwo>"
    And Ingreso ciudad en la que vives en el campo "<City>"
    And Ingreso state en la que vives en el campo "<StateRegion>"
    And Ingreso el campo de zip en "<ZipCode>"
    And Ingreso pais en la que vives en el campo "<Country>"
    And Oculto el teclado del celular
    And Presiono el boton "To Payment"
    And Valido el titulo de la pagina "Enter a payment Method"
    And Ingreso los campos de la tarjeta en "<fullName>"
    And Ingreso el numero de la tarjeta en "<CardNumber>"
    And Ingreso la expiracion de la tarjeta en "<ExpirationDate>"
    And Ingreso el codigo de seguridad de la tarjeta en "<SecurityCode>"
    And Descheckeo el check existente
    And Presiono nuevamente el check existente
    And Presiono el boton de "Review Order"
    And Valido que la mochila se encuentre seleccionada "<tituloObjeto>"
    And Presiono el boton de "Place Order"
    Then Valido que te rediriga a la pantalla finalizada "Checkout Complete"
    And Valido el texto en la pantalla existosa de compra "Thanks you for you order"
    And Valido el texto en la pantalla existosa de compra "Your new swag is on its way"
    And Valido el texto en la pantalla existosa de compra "Your order has been dispatched and will arrive as fast as the pony gallops!"
    And Valido la existencia del boton "Continue Shopping"
    And Presiono el boton de "Continue Shopping"


    Examples:
      | Username | Password | objeto | tituloObjeto | fullName | AddressOne | AddressTwo|
      | bob@example.com | 10203040 |mochila |Sauce Labs Backpack | Joao Leiva Ravanales |Costa Rica | Playa Ancha |