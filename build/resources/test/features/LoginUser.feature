Feature: Login_Sign in
  yo como usuario de la plataforma web automationpractice.com
  Deseo autenticarme en la pagina
  para poder comprar productos

  Background:
    Given El usuario se encuentra en la pagina web automationpractice.com listo para autenticarse

  Scenario: Login exitoso
    When  El usuario ingresa su correo y su contraseña
    Then  El usuario debera recibir un mensaje de confirmacion inicio de sesion como respuesta exitosa

  Scenario:Login no exitoso
    When  El usuario registra sus ingresa su correo pero no ingresa la contraseña
    Then  El usuario debera recibir un mensaje de error de campo vacio como respuesta no exitosa
