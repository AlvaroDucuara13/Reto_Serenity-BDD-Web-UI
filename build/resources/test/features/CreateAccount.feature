Feature: CreateAccount
  yo como usuario de la plataforma web automationpractice.com
  necesito crear una cuenta
  para poder ver los productos en venta

  Background:
    Given El usuario se encuentra en la pagina web automationpractice.com

  Scenario: CreateAccount exitoso
    When  El usuario ingresa su correo y luego registra toda su informacion
    Then  El usuario podra observar un mensaje de respuesta exitosa

  Scenario:CreateAccount no exitoso
    When  El usuario registra sus datos personales pero ingreso un formato invalido en ZipCode
    Then  El usuario podra observar un mensaje de error como respuesta no exitosa
