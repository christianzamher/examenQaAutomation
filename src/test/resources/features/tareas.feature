@gestor
Feature: Gestión de Tareas
  Background: Como Dev
              Quiero escribir tareas
              Para asignar las actividades

  Scenario: Crear una nueva tarea
    Given El usuario está en la página principal
    When El usuario completa los campos "Nombre", "Descripcion" y "Asignado a"
      | Nombre      | Descripcion                       | Asignado a |
      | Tarea de prueba | Esto es una descripción de prueba | Christian  |
    And El usuario hace clic en el botón "Crear Tarea"
    Then La tarea "Tarea de prueba" debería aparecer en la lista de tareas

