@tbk
Feature: Ingreso a la aplicacion de TBK
	ingreso a ala aplicacion y porobar funciones basicas
  
  
  Scenario Outline: Login cuenta tbk
    Given Me posisiono en la pagina del Login
    When ingreso el rut cliente<Rut_Cliente> rut comercial<Rut_Comercial> y pass<pass>
    And hago click en el boton ingresar

    Examples: 
      | Rut_Cliente | Rut_Comercial | pass |
      | "15094980-7" | "96689310-9" | "Piloto2019" |

  Scenario: Selecciono opciones de pagina principal
  	Given Me posisiono en la pagina principal
  	When ingreso un monto manualmente con los botones en pantalla
  	Then se ingresa correctamente el monto en el campo de texto de cuatro digitos
  	When presionar el boton de cobrar
  	Then aparece un mensaje de error ed conexion y presiono el boton de volver a intentar 