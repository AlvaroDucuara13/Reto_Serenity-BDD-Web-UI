Feature: Contac Us
  yo como cliente ingresado en la plataforma web automationpractice.com
  necesito contactarme con la empresa
  para enviar un mensaje de requerimientos

  Background:
    Given El cliente se encuentra en la plataforma web automationpractice.com

  Scenario: ContacUs exitoso
    When  El cliente ingresa sus datos personales y su mensaje de requerimiento
    Then  El cliente podra observar un mensaje de respuesta exitosa

  Scenario:ContacUs no exitoso
    When  El cliente ingresa sus datos personales pero olvido enviar el mensaje de requerimiento
    Then  El cliente podra observar un mensaje de advertencia como respuesta erronea
