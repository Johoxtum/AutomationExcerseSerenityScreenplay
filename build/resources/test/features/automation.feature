# encoding :iso-8859-1
@Auto
Feature: Como QA automation quiero automatizar los diferentes flujos de "Automation Exercise"

  @Register
  Scenario: Registrar una cuenta en la pagina Automation Exercise
    Given que Pablo ingresa a Automation Exercise
    When diligencia el formulario
    Then debería visualizar "ACCOUNT CREATED"
    
  @Login
  Scenario: Logear cuenta creada en la pagina Automation Exercise
    Given que Pablo ingresa a Automation Exercise
    When ingresa las credenciales de ingreso
    Then debería visualizar en el login "Automation"


