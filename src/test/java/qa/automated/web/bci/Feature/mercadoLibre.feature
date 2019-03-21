@mercadoLibre
Feature: Ver producto en mercado libre
  ingresar a la aplicacion de mercado libre, buscar y seleccionar un televisor,
  ver los detalles de este solo para utilizar nuevamente el scroll down

  Scenario: Ingreso a la aplicacion mercado libre
    Given abro la aplicacion y aparece un popup
    Then cierro el popup y compruebo de que no haya uno sobre otro

  Scenario Outline: Buscar un televisor
    Given Me posisiono en la pagina principal de Mercado libre
    When hago click en el boton de busqueda
    Then me posiciono en la ventana de busqueda
    When busco el producto <Producto> 
    Then aparece un listado de resultado selecciono el primer producto
    
    Examples: 
      | Producto  |
      | "televisor" |
      
   Scenario: seleccionar el primer televisor
   	Given me posisiono la pagina de resultados de busqueda
   	When selecciono el primer televisor
   	Then aparezco en la descripcion del producto y valido que sea ese
   	When hago un scroll down
   	Then llego al boton de continuar
   	