@pagoDeCuentasUFTAppium
Feature: Validar datos de pago

  Scenario: ingresar a página de Pagos
    Given que estoy en la pagina de inicio
    And estoy logeado con el rut
    When ingreso al menu de pagos
    Then se muestra la pagina de Pagos

  Scenario: validar pagos pendientes
    Given que estoy en la pagina de Pagos
    When ingreso a pagos pendientes
    Then valido datos de cuentas por pagar
