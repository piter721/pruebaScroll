@IngresoAplicacionAliexpress

Feature: Ingresar en aliexpres y gestionar un producto desde mi cuenta
	Ingresar a la aplicacion, buscar un celular, seleccionarlo, 
	agregarlo al carro de compras, luego iniciar sesion y
	eliminar el producto del carro de compras, 
	terminar en la pagina principal

  Scenario Outline: Login en Aliexpress
  Given me posiciono en el menu principal 
  When hago click en mi cuenta de la barra inferior
  Then aparece en opciones de la cuenta
  When hago click en iniciar sesion
  Then aparece un popup de inicio o registro
  When hago click en el boton de identificarme
  Then aparece la pagina de ingreso
  When ingreso el usuario <usuario> y pass <pass> 
  Then aparece en detalles de mi cuenta con mi cuenta agregada exitosamente
  
  Examples:
  		| usuario | pass |
  		| "esteesuncorreodepruebaparaqa@gmail.com" | "qa1234" |
  
  Scenario Outline: Buscar Celular
    Given que me posiciono en el menu principal
    When hago click en el boton de busqueda en el menu de la barra inferior
    Then aparece la pagina de busquedas 
    When ingreso el celular<celular> en el campo de texto en la parte superior
    Then aparece un listado de los resultados por nombre
    And selecciono el primer resultado

	Examples: 
      | celular |
      | "xaomi mi mix" |

  Scenario: Seleccionar el producto buscado
    Given me posiciono en la ventana de busqueda
    When aparece los resultados acorde a lo buscado
    Then selecciono el primer equippo en la pagina de busquedas

	Scenario: Añadir producto a la cesta
		Given me posiciono en la ventana de detalles del producto
		When hago click en el boton agregar a la cesta
		Then aparece un popup de seleccion de producto
  	When Selecciono las caracteristecas del producto 
  	And hago click en el boton continuar
  	Then aparece un popup informando que se añadio a la cesta con opciones
  	When hago click  en ir a cesta
  	Then ingreso a la cesta del usuario
  	
  Scenario: Eliminar el producto de la cesta
  	Given me posiciono en la ventana de mi cesta
  	When hago click en el recuadro en la parte izquierda del producto
  	And hago click en la imagen de bote de basura en la parte superior derecha 
		Then aparece un popup con un mensaje de seguridad de eliminacion
		When hago click en eliminar 
		Then aparece el cesto sin el producto recientemente seleccionado
		When hago click a la flecha en la parte superior izquierda
		Then aparece la ventana de busqueda con la descripcion del producto anteriormente seleccionado
		When hago click en el boton de opciones
		Then me aparece un menu de opciones generales
		When selecciono mi cuenta
		Then aparece en la pagina de mi cuenta
		
	Scenario: Logout
		Given me posiciono en el menu principal 
  	When hago click en mi cuenta de la barra inferior
  	Then aparece en opciones de la cuenta
  	When hago click en ajustes
  	Then aparece una ventana de ajustes 
  	When hago click en el boton cerrar sesion
  	Then aparece un popup validando que cierro sesion
  	When hago click en el boton aceptar
  	Then aparece en el menu principal con sesion cerrada
		
		
		