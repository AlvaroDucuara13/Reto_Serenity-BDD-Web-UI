Feature: CreateAccount
  yo como cliente ingresado en la plataforma web automationpractice.com
  necesito crear una cuenta
  para poder ver los productos en venta

  Background:
    Given El cliente se encuentra en la plataforma web automationpractice.com

  Scenario: CreateAccount exitoso
    When  El cliente ingresa su correo y luego registra toda su informacion
    Then  El cliente podra observar un mensaje de respuesta exitosa

  Scenario:CreateAccount no exitoso
    When  El cliente registra sus datos personales pero ingreso un formato invalido en ZipCode
    Then  El cliente podra observar un mensaje de error como respuesta no exitosa
