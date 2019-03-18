
@ScrollDown
Feature: Hacer un scroll down 
  Ingresar en la aplicacion e intentar llegar a una ventana
  que tenga mas opciones, para poder bajar

  Scenario: ingreso a la app
    Given ingresar a la pagina principal
    Then seleccionar una opcion de la pantalla 
    When estoy dentro de la seleccion
    Then hago un scroll down para ver opciones que estan abajo
    