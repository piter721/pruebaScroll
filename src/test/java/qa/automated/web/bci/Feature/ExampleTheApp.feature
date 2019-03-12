@ExampleTheApp
Feature: Ingresar a la aplicacion y probar sus funcionalidades, en este caso, cambiaremos el contenido del clipboard

  Scenario: Ingreso a la ventana de opciones
    Given Me posisiono en la pagina principal
    When selecciono la opcion clipboard demo

  Scenario Outline: Ejecicio basico de clipboard
    Given me posisiono en la ventana de clipboard
    When ingreso una palabra<palabra> en el campo de texto
    And  presiono el boton guardar y luego el boton refresh
    Then se cambia el texto del clipboard por la palabra ingresada anteriormente

    Examples: 
      | palabra |
			| "hola mundo" |