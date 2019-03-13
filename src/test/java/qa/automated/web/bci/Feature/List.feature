@lista
Feature: ingresar a la aplicacion y seleccionar la opcion stratus de la lista

  Scenario: Me posisiono en el inicio
  Given Me posisiono en la pagina principal
  When selecciono la opcion List

  
  Scenario: me posisiono en las listas de opciones	
  Given bajo y selecciono la opcion stratus
  Then me aparece un mensaje que me interesa stratus cloud
  When selecciono ok y desaparece el popup emergente
  