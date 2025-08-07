package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Hooks;
import utilities.Logs;

import java.time.Duration;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class TareasSteps {
    private final WebDriver driver;

    public TareasSteps() {
        this.driver = Hooks.getDriver();
    }

    @Given("El usuario está en la página principal")
    public void elUsuarioEstaEnLaPaginaPrincipal() {
        Logs.info("Iniciando las pruebas");
        driver.get("http://93.188.165.79:8003");
    }

    @When("El usuario completa los campos {string}, {string} y {string}")
    public void elUsuarioCompletaLosCampos(String campo1, String campo2, String campo3, DataTable dataTable) {
        Logs.info("Colocando info en los campos");
        Map<String, String> data = dataTable.asMaps().get(0);

        WebElement nombreInput = driver.findElement(By.id("task_name"));
        WebElement descripcionInput = driver.findElement(By.id("content"));
        WebElement asignadoAInput = driver.findElement(By.id("asignee"));

        nombreInput.sendKeys(data.get("Nombre"));
        descripcionInput.sendKeys(data.get("Descripcion"));
        asignadoAInput.sendKeys(data.get("Asignado a"));
    }

    @When("El usuario hace clic en el botón {string}")
    public void elUsuarioHaceClicEnElBoton(String nombreBoton) {
        Logs.info("Click en el boton");
        WebElement crearBoton = driver.findElement(By.xpath("//button[text()='" + nombreBoton + "']"));
        crearBoton.click();
    }

    @Then("La tarea {string} debería aparecer en la lista de tareas")
    public void laTareaDeberiaAparecerEnLaListaDeTareas(String nombreTarea) {
        Logs.info("validacion de tareas en el gestor");
        // Define el localizador del elemento que vas a buscar
        By locator = By.xpath("//h5[contains(text(), 'Nombre Tarea: " + nombreTarea + "')]");

        // Crea un objeto WebDriverWait para esperar hasta 10 segundos
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Espera a que el elemento esté visible
        WebElement tareaCreada = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

        // Verifica que el elemento esté visible en la página
        assertTrue("La tarea '" + nombreTarea + "' no se mostró en la lista.", tareaCreada.isDisplayed());
    }
}
