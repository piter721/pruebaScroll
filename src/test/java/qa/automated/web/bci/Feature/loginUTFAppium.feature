@loginUFTAppium
Feature: Iniciar Sesion

  Background:  
    Given que soy un usuario
    And la aplicacion esta iniciada

  Scenario: Ingresar a pagina Login
    Given que el boton ingresar esta habilitado
    When hago click en el boton ingresar
    Then aparece pagina de login

  Scenario Outline: Ingresar datos Correctos
    Given que existen los campos de ingreso de datos
    When ingreso rut<rut> y contraseña<pass>
    Then aparezco en pagina de inicio

    Examples:
      | rut         | pass |
      | "231884440" | "159753"   |
