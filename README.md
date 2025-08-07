# Examen QA Automation para Kopius Academy

Este proyecto es un ejercicio de automatización de pruebas para una aplicación web simple de gestión de tareas. El objetivo es validar la funcionalidad de la aplicación utilizando un framework de automatización construido con **Selenium**, **Java** y **Cucumber**.

![](images/gestor.png)


### Reportes y Documentación

Puedes descargar el [Reporte de Pruebas](https://github.com/christianzamher/examenQaAutomation/raw/main/images/Reporte%20Gestor%20de%20Tareas%20-%20Christian%20.docx) para más detalles sobre el proyecto.
---

## 🚀 Tecnologías y Herramientas

* **Java 11+**: Lenguaje de programación principal.
* **Selenium WebDriver**: Para la automatización de la interacción con el navegador.
* **Cucumber**: Para la creación de pruebas de aceptación en lenguaje Gherkin.
* **JUnit Platform**: Para ejecutar los tests de Cucumber.
* **Maven**: Como herramienta de gestión de dependencias y construcción del proyecto.
* **Log4j2**: Para el manejo de logs.
* **WebDriverManager** : Para la gestión automática de los drivers de los navegadores.

---

## 🛠 Estructura del Proyecto

El proyecto sigue una estructura de Maven estándar, organizada para facilitar la lectura y el mantenimiento:

* `src/test/java/runner`: Contiene la clase `CucumberTest.java`, el punto de entrada para ejecutar las pruebas.
* `src/test/java/steps`: Contiene las clases de pasos (`Steps`), donde se implementa la lógica de Selenium para cada paso del `feature`.
* `src/test/java/utilities`: Contiene las clases de utilidad, como `Hooks.java` para la gestión del ciclo de vida del WebDriver y `DriverManagerFactory` para la configuración de diferentes navegadores.
* `src/test/resources/features`: Contiene los archivos `.feature` escritos en lenguaje Gherkin, que describen los escenarios de prueba.
* `pom.xml`: Archivo de configuración de Maven que gestiona las dependencias del proyecto.

---

## ✅ Cómo Ejecutar las Pruebas

Sigue estos pasos para ejecutar la suite de pruebas:

1.  **Clona el repositorio**:
    ```bash
    git clone [https://github.com/christianzamher/examenQaAutomation.git](https://github.com/christianzamher/examenQaAutomation.git)
    cd examenQaAutomation
    ```
2.  **Configura el WebDriver**:
    Asegúrate de tener el driver del navegador (por ejemplo, `chromedriver.exe`) en una ubicación accesible o utiliza una librería como WebDriverManager para gestionarlo automáticamente.
3.  **Ejecuta las pruebas**:
    Puedes ejecutar las pruebas desde tu IDE (IntelliJ, Eclipse, etc.) haciendo clic derecho en la clase `CucumberTest.java` y seleccionando "Run 'CucumberTest'".
    Alternativamente, puedes usar Maven desde la línea de comandos:
    ```bash
    mvn test
    ```
4.  **Visualiza los reportes**:
    Una vez que las pruebas finalicen, se generará un reporte HTML en la siguiente ubicación:
    `target/cucumber-reports/index.html`

---

## 📝 Escenarios de Prueba Automatizados

Actualmente, el framework automatiza el siguiente escenario:

* **Crear una nueva tarea**:
    * Verifica que un usuario puede completar los campos de nombre, descripción y asignación.
    * Verifica que la tarea se crea y se muestra correctamente en la lista.

---

